package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.mapper.ProductMapper;
import com.example.hibarnet_testing.repositories.ProductRepo;
import org.springframework.stereotype.Service;

@Service
public class productService {
    private ProductRepo productDb;
    public  ProductRepo productRepo(){
        return this.productDb;
    }

    public Product productCreate(ProductDTO item) {
        Product product= ProductMapper.dtoToEntity(item);
        productDb.save(product);
        System.out.println("Product saved to db : "+product);
        return product;
    }

    public Product productUpdate(ProductDTO item) {
        Product product=productDb.findById(item.id()).orElse(null);
        if (product==null) {System.out.println("product not found");return null;}
        product=ProductMapper.dtoToEntity(item);
        productDb.save(product);
        System.out.println("product updated : "+product);
        return product;
            }
}
