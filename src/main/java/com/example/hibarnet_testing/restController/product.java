package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class product {
    @Autowired
    ProductRepo productDb;
    @PostMapping("/product")
    public ProductDTO productCreate(@RequestBody ProductDTO product){


        return product;
    }

    @PutMapping("/product")
    public String productUpdate(){return "status ok";}

    @DeleteMapping("/product")
    public String productDelete(){return "status ok";}

    @GetMapping("/product")
    public com.example.hibarnet_testing.domain.Product productView(){
        Product p=productDb.getReferenceById(1L);
        return p;
    }




}



