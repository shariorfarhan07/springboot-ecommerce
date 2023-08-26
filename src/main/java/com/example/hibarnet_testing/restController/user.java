package com.example.hibarnet_testing.restController;


import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.dto.userDTO;
import com.example.hibarnet_testing.service.UserService;
import org.apache.coyote.Response;
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
    public User createUser(@RequestBody userDTO user)
    {   User userCreated=userService.createUser(user);
        return userCreated;

    }

    /* updates specific user  */
    @PutMapping()
    public User updateUser(@RequestBody User user){
        return userService.userUpdate(user);
    }

    /* delete specific user*/
    @DeleteMapping("/{id}")
    public Boolean deleteUser(@PathVariable long id){
       try {
           userService.deleteUser(id);
       }catch (Exception e){
           return  false;
       }
        return true;
    }






}
