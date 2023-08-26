package com.example.hibarnet_testing.mapper;

import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.dto.userDTO;
import com.example.hibarnet_testing.dto.userDTO;

public class UserMapper {
    public  static User userToEntity(userDTO u){
        User newUser=new User();
        newUser.setId(u.id());
        newUser.setName(u.name());
        newUser.setPassword(u.password());
        return newUser;
    }

    public  static userDTO entityToUser(User u){
        return new userDTO(u.getId(),u.getName(),u.getPhone(),u.getPassword());
    }






}
