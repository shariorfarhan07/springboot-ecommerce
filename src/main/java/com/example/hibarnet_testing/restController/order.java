package com.example.hibarnet_testing.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class order {

    @GetMapping("/order")
    public String creatOrder(){
        System.out.println();
        return "";}
    @PutMapping("/order")
    public String updateOrder(){ return "";}

    @PutMapping("/order/{id}")
    public String stateChangeOrder(){ return "";}


}
