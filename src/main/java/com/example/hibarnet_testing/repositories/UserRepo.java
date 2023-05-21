package com.example.hibarnet_testing.repositories;

import com.example.hibarnet_testing.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Long> {
    List<User> findByName(String name);
}
