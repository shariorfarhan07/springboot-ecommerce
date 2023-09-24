package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.repositories.ProductRepo;
import com.example.hibarnet_testing.dto.CurtEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class Curt {
    private Map<Long ,CurtEntity> productmap;
    private double total;
    private final Logger log= LoggerFactory.getLogger(Curt.class);
    @Autowired
    private ProductRepo productDb;

    public Curt(Curt c){
        if (c!=null){
            this.productmap =c.productmap;
            this.total=c.total;
        }else {
            this.productmap =new HashMap<>();
            this.total=0;
        }
    }


    public Product addtoCurt(long product_id, Long add) {
        CurtEntity product;
        int p_qty = 0;
        if (this.productmap.containsKey(product_id)) {
            product = this.productmap.get(product_id);
            this.total=this.total-product.getPrice();
            double price=(product.getQuantity()+add)*product.getPrice();
            this.total=this.total+price;
            product.setQuantity(product.getQuantity()+add);
            product.setPrice(price);


        }else{
            Product productdata = productDb.findById(product_id).orElse(null);
            if (productdata == null){
                log.info("this product is no available");
                return null;
            }
            product=CurtEntity.builder()
                    .product(productdata)
                    .price(productdata.getPrice()*add)
                    .quantity(add).build();

            productmap.put(productdata.getId(),product);
        }
        log.info("this product added successfully");


        return product.getProduct();
    }

    public Product removeFromCurt(long product_id, Long remove) {
        CurtEntity product = null;
        int p_qty = 0;
        if (this.productmap.containsKey(product_id)) {
            product = this.productmap.get(product_id);
            this.total=this.total-product.getPrice();

            Long newQty=product.getQuantity()-remove;
            if (newQty<0) {
                log.info("Product quantity can't be negetive");
                return null;
            }
            double price=newQty*product.getPrice();
            this.total=this.total+price;
            product.setQuantity(product.getQuantity()+add);
            product.setPrice(price);


        }else{
            log.info("This product was never added to curt. Please add to curt first");
        }
        log.info("this product decreased successfully");


        return (product==null)?null:product.getProduct();
    }





}
