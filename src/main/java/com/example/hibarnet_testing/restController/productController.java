package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.service.productService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class productController {

    private final productService productSr;
    private final Logger log= LoggerFactory.getLogger(productController.class);

    public productController(productService productSr) {
        this.productSr = productSr;
    }

    @PostMapping()
    public Product productCreate(@RequestBody ProductDTO payload){
        log.trace(payload.toString());

        Product product = null;
        try {
            product = productSr.productCreate(payload);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return product;
    }

    @PutMapping("/{id}")
    public Product productUpdate(@RequestBody ProductDTO payload){
        Product product = null;
        try {
            product = productSr.productUpdate(payload);
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    @DeleteMapping("/{id}")
    public String productDelete(@PathVariable("id") long id){return productSr.deleteProduct(id);}

    @GetMapping("/all")
    public List<Product> productView(){
        return productSr.getAllProduct();
    }


    @GetMapping
    public Page<Product> findProduct(
            @RequestParam(value = "pageNumber",defaultValue = "0") int pageNumber,
            @RequestParam(value = "quantity",defaultValue = "10") int quantity,
            @RequestParam(value = "order",defaultValue = "asc")String order,
            @RequestParam(value = "field",defaultValue = "id") String field
    )
    {
        System.out.println(pageNumber+"  "+quantity+"  "+order+"  "+field);
       return productSr.findProductsWithPaginationSortedWithField(pageNumber,quantity,field,order);

           }
    @GetMapping("{id}")
    public Optional<Product> getProductWithId(@PathVariable("id") long id){
        return productSr.findProductWithId(id);
    }






}



