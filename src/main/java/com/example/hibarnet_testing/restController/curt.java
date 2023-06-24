package com.example.hibarnet_testing.restController;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curt")
public class curt {

    @GetMapping("/{id}/{qty}")
    public String addtocurt(){
        return "";
    }
    @DeleteMapping("/{id}")
    public String removeFromCart(){
        return "";
    }


}

