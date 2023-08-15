package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.mapper.ProductMapper;
import com.example.hibarnet_testing.repositories.ProductRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    private final ProductRepo productDb;

    public productService(ProductRepo productDb) {
        this.productDb = productDb;
    }

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

    public List<Product> getAllProduct() {
        return productDb.findAll();
    }

    public List<Product> firndProductsWithSorting(String field){

        return productRepo().findAll(Sort.by(Sort.Direction.ASC,field));
    }


    public Page<Product> findProductsWithPagination(int offset, int pageSize){
        return  productRepo().findAll(PageRequest.of(offset,pageSize));
    }


    public Page<Product> findProductsWithPaginationSortedWithField (int offset, int pageSize,String field,String order){
        if (order.equals("dec")) return  productRepo().findAll(PageRequest.of(offset,pageSize,Sort.by(Sort.Direction.DESC,field)));

        return  productRepo().findAll(PageRequest.of(offset,pageSize,Sort.by(Sort.Direction.ASC,field)));
    }



}
