package com.example.hibarnet_testing.repositories;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.restController.product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
//    Page<product> findAll();
}