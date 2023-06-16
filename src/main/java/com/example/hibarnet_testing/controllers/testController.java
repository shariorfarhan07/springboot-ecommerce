package com.example.hibarnet_testing.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@RequestMapping("v1")
public class testController {

    @ResponseBody
    @GetMapping("/cookie")
    public String cookie(HttpServletResponse response, HttpServletRequest request)
    {   Cookie cookies[] =request.getCookies();
        String s="";
        for (Cookie cookie: cookies) {
            s+="{"+cookie.getName()+","+cookie.getValue()+"}\n";
            if (cookie.getName().equals("visited")) return s;
        }
        jakarta.servlet.http.Cookie cookie1 =new Cookie("farhan","isThebest");
        jakarta.servlet.http.Cookie cookie2 =new Cookie("visited","1");
        response.addCookie(cookie1);
        response.addCookie(cookie2);

        return  "test";
    }


    @GetMapping("/getdata")
    @ResponseBody
    public String getdata(){
        return "this is farhan" ;
    }





}
