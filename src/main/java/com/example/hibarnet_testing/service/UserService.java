package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.dto.userDTO;
import com.example.hibarnet_testing.mapper.UserMapper;
import com.example.hibarnet_testing.repositories.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<User> getUser() {
        return userRepo.findAll();
    }
    public Iterable<User> getUser(Long id) {
        return userRepo.findById(id);
    }

    public User createUser(userDTO user) {
        User u= UserMapper.userToEntity(user);
        return u;
    }

    public void deleteUser(long id) {
        User u= (User) userRepo.findById(id);
        userRepo.delete(u);
    }

    public User userUpdate(User user) {
        User u= (User) userRepo.findById(user.getId());
        return u;
    }
}
