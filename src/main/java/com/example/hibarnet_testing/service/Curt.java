package com.example.hibarnet_testing.service;

import com.example.hibarnet_testing.domain.Product;
import com.example.hibarnet_testing.domain.User;
import com.example.hibarnet_testing.repositories.ProductRepo;
import com.example.hibarnet_testing.repositories.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class Curt {
    private Map<Long,Integer> product;
    private double Total;
    private final Logger log= LoggerFactory.getLogger(Curt.class);
    @Autowired
    private ProductRepo productDb;

    public Curt(Curt c){
        if (c!=null){
            this.product=c.product;
            this.Total=c.Total;
        }else {
            this.product=new HashMap<>();
            this.Total=0;
        }
    }


    private Product addOrRemove(long product_id, int quantity) {
        Product product = productDb.findById(product_id).orElse(null);
        if (product == null){  log.info("this product is no available"); return product;}
        int p_qty = 0;
        if (this.product.containsKey(product_id)) {
            p_qty = this.product.get(product_id);
        }
        if (p_qty+quantity<0) {
            log.info("this product is no available");
        }

        double price=product.getPrice()*quantity;
        this.Total+=price;



        return null;
    }
}
