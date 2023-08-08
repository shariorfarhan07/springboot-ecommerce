package com.example.hibarnet_testing.mapper;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;

public class ProductMapper {
    public static Product dtoToEntity(ProductDTO item){
        Product product=new Product();
        product.setId(item.id());
        product.setName(item.name());
        product.setPrice(item.price());
        product.setStock(item.stock());
        product.setBrand(item.brand());
        product.setCategory(item.category());
        return product;
    }
    private  static  ProductDTO EntityToDto(Product p){
        ProductDTO dto=new ProductDTO(p.getId(), p.getName(), p.getPrice(), p.getStock(), p.getBrand(), p.getCategory());
        return null;

    }








}
