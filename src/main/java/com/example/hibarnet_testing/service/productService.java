package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
    private ProductRepo productDb;
    public  ProductRepo productRepo(){
        return this.productDb;
    }

    public Product productCreate(ProductDTO item) {
        Product product=new Product();
        product.setId(item.id());
        product.setName(item.name());
        product.setPrice(item.price());
        product.setStock(item.stock());
        product.setBrand(item.brand());
        product.setCategory(item.category());
        productDb.save(product);
        System.out.println("Product saved to db : "+product);
        return product;
    }

    public Product productUpdate(ProductDTO item) {
        Product product=productDb.findById(item.id()).orElse(null);
        if (product==null) {System.out.println("product not found");return null;}
        product.setName(item.name());
        product.setPrice(item.price());
        product.setStock(item.stock());
        product.setBrand(item.brand());
        product.setCategory(item.category());
        productDb.save(product);
        System.out.println("product updated : "+product);
        return product;
            }
}
