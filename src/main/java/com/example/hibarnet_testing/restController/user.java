package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class user {
    private final UserService userService;

    public user(UserService userService) {
        this.userService = userService;
    }

    /* returns all the user*/
    @GetMapping()
    public Iterable<User> User(){
        return userService.getUser();
    }

    /* returns single the user*/
    @GetMapping("/{id}")
    public Iterable<User> getSingleUser(@PathVariable Long id){
        return userService.getUser(id);
    }


    /* returns all the user*/
    @PostMapping()
    public String createUser(@RequestBody com.example.hibarnet_testing.dto.user user)
    {
        userService.createUser(user);
        return "status ok";

    }

    /* updates specific user  */
    @PutMapping()
    public String updateUser(@RequestBody user user){
        userService.userUpdate(user);
        return "status ok";
    }

    /* delete specific user*/
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id){
        userService.deleteUser(id);
        return "status ok";
    }






}
