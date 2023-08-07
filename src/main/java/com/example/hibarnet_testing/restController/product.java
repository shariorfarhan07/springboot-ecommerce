package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.service.productService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class product {

    private final productService productSr;

    public product(productService productSr) {
        this.productSr = productSr;
    }

    @PostMapping()
    public Product productCreate(@RequestBody ProductDTO payload){
        Product product = null;
        try {
            product = productSr.productCreate(payload);
        }catch (Exception e){
            e.printStackTrace();
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

    @DeleteMapping()
    public String productDelete(){return "status ok";}

    @GetMapping("/")
    public List<product> productView(){
//        int pageSize=5;
//        int pageNumber=1;
//        Pageable p= (Pageable) PageRequest.of(pageNumber,pageSize);
//        Page<product>  pageProduct=this.productSr.productRepo().findAll(p);



        return null;
    }




}



