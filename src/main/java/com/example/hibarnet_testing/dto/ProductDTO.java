package com.example.hibarnet_testing.dto;

import com.example.hibarnet_testing.domain.Categories;

import java.util.Set;

public record Product(Long id,
                      String name,
                      double price,
                      int stock,
                      Set<Categories> category) {
}
