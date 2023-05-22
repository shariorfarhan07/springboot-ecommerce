package com.example.hibarnet_testing.repositories;
import com.example.hibarnet_testing.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo  extends CrudRepository<Order,Long> {
}
