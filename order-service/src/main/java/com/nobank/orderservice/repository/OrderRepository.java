package com.nobank.orderservice.repository;

import com.nobank.orderservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface OrderRepository extends MongoRepository<Order, String> {
    Collection<Order> findByUserId(String userId);
}
