package com.example.hibarnet_testing.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable=true)
    private double price;
    @Column(nullable=true)
    private double deliveryCharge;


    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate= new java.sql.Date(new java.util.Date().getTime());;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date= new java.sql.Date(new java.util.Date().getTime());



    @ManyToOne
    private User user;

    @OneToOne
    private Address address;

    @OneToMany(cascade = { CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private List<OrderDetails> orderDetails=new ArrayList<>();






}
