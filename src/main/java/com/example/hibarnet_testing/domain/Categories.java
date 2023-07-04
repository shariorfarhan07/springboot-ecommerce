package com.example.hibarnet_testing.domain;

import jakarta.persistence.*;
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
@Table(name = "Category")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(unique = true)
    private String title;


    @ManyToMany
    @JoinTable(
            name = "category_connection",
            joinColumns = @JoinColumn(name = "Category_id"),
            inverseJoinColumns = @JoinColumn(name = "Product_id"))

    private Set<Product> productList= new HashSet<>() ;



}
