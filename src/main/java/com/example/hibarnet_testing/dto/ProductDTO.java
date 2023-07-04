package com.example.hibarnet_testing.dto;

import com.example.hibarnet_testing.domain.Categories;

import java.util.Set;

public record ProductDTO(Long id,
                         String name,
                         double price,
                         int stock,
                         String brand,
                         Set<Categories> category) {

}
