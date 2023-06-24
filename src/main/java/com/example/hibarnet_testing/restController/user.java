package com.example.hibarnet_testing.restController;


import org.springframework.web.bind.annotation.*;

@RestController
public class user {
    /* returns all the user*/
    @GetMapping("/user")
    public String User(){
        return "status ok";
    }

    /* returns single the user*/
    @GetMapping("/user/{id}")
    public String getSingleUser(){
        return "status ok";
    }

    /* returns all the user*/
    @PostMapping("/user")
    public String createUser(){
        return "status ok";
    }


    /* updates specific user  */
    @PutMapping("/user")
    public String updateUser(){

        return "status ok";
    }



    
    /* delete specific user*/
    @DeleteMapping("/delete/{id}")
    public String deleteUser(){
        return "status ok";
    }






}
