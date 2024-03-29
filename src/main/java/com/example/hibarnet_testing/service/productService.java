package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.dto.ProductDTO;
import com.example.hibarnet_testing.mapper.ProductMapper;
import com.example.hibarnet_testing.repositories.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productService {
    private final Logger log= LoggerFactory.getLogger(productService.class);
    private final ProductRepo productDb;

    public productService(ProductRepo productDb) {
        this.productDb = productDb;
    }

    public  ProductRepo productRepo(){
        return this.productDb;
    }

    public Product productCreate(ProductDTO item) {
        log.info("Parameters => "+item.toString());
        Product product= ProductMapper.dtoToEntity(item);
        productDb.save(product);
        log.info("Product saved to db : "+product);
        return product;
    }

    public Product productUpdate(ProductDTO item) {
        log.info("items for update => "+item.toString());
        Product product=productDb.findById(item.id()).orElse(null);
        if (product==null) {
            log.info("product not found");
            return null;
        }
        log.info("items form database => "+product.toString());
        product=ProductMapper.dtoToEntity(item);
        productDb.save(product);
        log.info("product updated : "+product);
        return product;
    }

    public List<Product> getAllProduct() {
        List<Product> products= productDb.findAll();
        if (products==null){
            log.info("No products available");
        }else{
            log.info(products.toString());
        }
        return products;
    }



//   all the things you can do with pagination's
    public List<Product> findProductsWithSorting(String field){

        return productDb.findAll(Sort.by(Sort.Direction.ASC,field));
    }

    public Page<Product> findProductsWithPagination(int offset, int pageSize){
        log.info("offset : "+offset+" pagesize : "+pageSize);
        Page<Product> pages =productDb.findAll(PageRequest.of(offset,pageSize));
        if (pages==null) log.info("No products available");
        else log.info(pages.toString());
        return pages;
    }

    public  Page<Product> findProductsWithPaginationSortedWithField (int offset, int pageSize, String field, String order){
        log.info("offset : "+offset+" pagesize : "+pageSize+" field :"+field+" order : "+order);
        if (order.equals("dec")) {
            return productDb.findAll(PageRequest.of(offset, pageSize, Sort.by(Sort.Direction.DESC, field)));
        }

        return productDb.findAll(PageRequest.of(offset, pageSize, Sort.by(Sort.Direction.ASC, field)));
    }


    public Optional<Product> findProductWithId(long id) {
        Optional<Product> product= productDb.findById(id);
        if (product==null){
            log.info("product not found id:"+id);
            return null;
        }
        return product;
    }

    public String deleteProduct(long id) {
        Optional<Product> p=findProductWithId(id);
        if (p==null) log.info("there is no product with id: " + id);
        p.ifPresent(productDb::delete);
        return p.toString()+" Has been deleted";
    }
}
