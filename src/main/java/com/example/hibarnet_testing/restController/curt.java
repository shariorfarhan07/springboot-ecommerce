package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.dto.Test;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curt")
public class curt {

    @GetMapping("/{id}/{qty}")
    public String addtocurt(@PathVariable("id") Long id ){
        return "";
    }
    @DeleteMapping("/{id}")
    public String removeFromCart(@PathVariable("id") Long id){
        return "id"+id;
    }

    @PostMapping("test")
    public String test(@RequestBody Test test){
        System.out.println(test);
        return "{'message':'success'}";
    }

    public  String test(){
        return "test";
    }

}

