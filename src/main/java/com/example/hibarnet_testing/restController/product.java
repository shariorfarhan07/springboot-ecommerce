package com.example.hibarnet_testing.restController;


import org.springframework.web.bind.annotation.*;

@RestController
public class product {

    @PostMapping("/product")
    public String productCreate(){return "status ok";}

    @PutMapping("/product")
    public String productUpdate(){return "status ok";}

    @DeleteMapping("/product")
    public String productDelete(){return "status ok";}

    @GetMapping("/product")
    public String productView(){return "status ok";}




}



