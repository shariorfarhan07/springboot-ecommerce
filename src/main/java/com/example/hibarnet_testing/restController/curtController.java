package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.dto.Test;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curt")
public class curtController {

    @GetMapping("/{id}")
    public String addtocurt(@PathVariable("id") Long id,
                            @RequestParam(value = "add",defaultValue = "0") int add,
                            @RequestParam(value ="remove",defaultValue = "0") int remove ){



        return "";
    }


    @GetMapping("")
    public String test(){
        System.out.println("test method");
        return "{'message':'success'}";
    }



}

