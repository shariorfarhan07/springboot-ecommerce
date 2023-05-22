package com.example.hibarnet_testing.domain;


import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private double price;
    private int stock;
    private String brand;

//    @ManyToMany
//    @JoinTable(name = "Product_category", joinColumns = @JoinColumn(name = "Product_id"),
//            inverseJoinColumns = @JoinColumn(name = "category_id"))
//    private Set<Category> category= new HashSet<>();

}
