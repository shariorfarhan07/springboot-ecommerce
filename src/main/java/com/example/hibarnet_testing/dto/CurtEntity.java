package com.example.hibarnet_testing.dto;

import com.example.hibarnet_testing.domain.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CurtEntity {
    private Product product;
    private long quantity;
    private double price;
}
