package com.example.hibarnet_testing.controllers;

import aj.org.objectweb.asm.ConstantDynamic;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class testController {

    @ResponseBody
    @GetMapping("/")
    public String cookie(HttpServletResponse response, HttpServletRequest request)
    {   Cookie cookies[] =request.getCookies();
        for (Cookie cookie: cookies) {
            System.out.println(cookie.getName()+","+cookie.getValue());
            if (cookie.getName().equals("visited")) return "visited";
        }
        jakarta.servlet.http.Cookie cookie1 =new Cookie("farhan","isThebest");
        jakarta.servlet.http.Cookie cookie2 =new Cookie("visited","1");
        response.addCookie(cookie1);
        response.addCookie(cookie2);

        return  "test";
    }
}
