package com.example.hibarnet_testing.repositories;

import com.example.hibarnet_testing.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<user,Long> {
    List<user> findByName(String name);
}
