package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class product {
    @Autowired
    productService productSr;
    @PostMapping("/product")
    public Product productCreate(@RequestBody ProductDTO payload){
        Product product = null;
        try {
            product = productSr.productCreate(payload);
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    @PutMapping("/product/{id}")
    public Product productUpdate(@RequestBody ProductDTO payload){
        Product product = null;
        try {
            product = productSr.productUpdate(payload);
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    @DeleteMapping("/product")
    public String productDelete(){return "status ok";}

    @GetMapping("/product")
    public String productView(){
     return  "this is a string";
    }




}



