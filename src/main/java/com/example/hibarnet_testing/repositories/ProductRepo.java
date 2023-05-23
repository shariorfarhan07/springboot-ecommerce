package com.example.hibarnet_testing.repositories;

import com.example.hibarnet_testing.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}