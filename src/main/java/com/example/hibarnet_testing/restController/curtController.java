package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.service.productService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/curt")
public class curtController {
    private final productService productSr;

    public curtController(productService productSr) {
        this.productSr = productSr;
    }


    @GetMapping("/{id}")
    public String addtocurt(@PathVariable("id") Long id,
                            @RequestParam(value = "add",defaultValue = "0") int add,
                            @RequestParam(value ="remove",defaultValue = "0") int remove ){
        Optional<Product> product=productSr.findProductWithId(id);

        if (product.isEmpty()) return "No product found";
        if (add<=0) return "add cant be less than or equal to zero";
        if (remove<=0) return "remove cant be less than or equal to zero";
        Product product1 =product.get();






        return "";
    }


    @GetMapping("")
    public String test(){
        System.out.println("test method");
        return "{'message':'success'}";
    }



}

