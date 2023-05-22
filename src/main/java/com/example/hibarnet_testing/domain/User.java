package com.example.hibarnet_testing.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="name", nullable=false, length=100)
    private String name;
    @Column(name="phone", nullable=true, length=14)
    private String phone;
    @Column(name="password", nullable=false, length=50)
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created= new java.sql.Date(new java.util.Date().getTime());
    private Date lastLogin;




    @OneToMany(cascade = { CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private List<Address> addresses=new LinkedList<>();

    @OneToMany(cascade = { CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "Order_id")
    private List<Order> order=new LinkedList<>();

}
