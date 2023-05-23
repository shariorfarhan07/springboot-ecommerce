package com.example.hibarnet_testing.repositories;

import com.example.hibarnet_testing.domain.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Long>, JpaSpecificationExecutor<OrderDetails> {
}