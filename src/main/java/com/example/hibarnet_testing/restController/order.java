package com.example.hibarnet_testing.restController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class order {

    @GetMapping()
    public String creatOrder(){
        System.out.println("this is farhan");
        return "this is farhan";}
    @PutMapping()
    public String updateOrder(){ return "";}

    @PutMapping("/{id}")
    public String stateChangeOrder(){ return "";}


}
