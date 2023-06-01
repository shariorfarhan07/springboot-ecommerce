package com.example.hibarnet_testing.controllers;

import aj.org.objectweb.asm.ConstantDynamic;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @ResponseBody
    @GetMapping("/")
    public String cookie(HttpServletResponse response){
        jakarta.servlet.http.Cookie cookie1 =new Cookie("farhan","isThebest");
        response.addCookie(cookie1);

        return  "test";
    }
}
