package com.example.hibarnet_testing.restController;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class user {
    /* returns all the user*/
    @GetMapping()
    public String User(){
        return "status ok";
    }

    /* returns single the user*/
    @GetMapping("/{id}")
    public String getSingleUser(@PathVariable String id){
        return "status ok";
    }

    /* returns all the user*/
    @PostMapping()
    public String createUser(){
        return "status ok";
    }

    /* updates specific user  */
    @PutMapping()
    public String updateUser(){

        return "status ok";
    }

    /* delete specific user*/
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        return "status ok";
    }






}
