package com.example.hibarnet_testing.mapper;

import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.dto.user;

public class UserMapper {
    public  static User userToEntity(user u){
        User newUser=new User();
        newUser.setId(u.id());
        newUser.setName(u.name());
        newUser.setPassword(u.password());
        return newUser;
    }

    public  static user entityToUser(User u){
        return new user(u.getId(),u.getName(),u.getPhone(),u.getPassword());
    }






}
