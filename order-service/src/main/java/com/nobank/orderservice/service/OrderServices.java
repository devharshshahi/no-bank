package com.nobank.orderservice.service;

import com.nobank.orderservice.model.Bill;
import com.nobank.orderservice.model.Order;
import com.nobank.orderservice.model.Product;
import com.nobank.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Product product,String userId, int quantity){
        Order order = new Order();
        order.setProduct(product);
        order.setUserId(userId);
        Bill bill = new Bill();
        //TODO: generate bill in fee service

        order.setBill(bill);
        order.setQuantity(quantity);

        orderRepository.save(order);

        // TODO: update product details in product


        return order;
    }

    public List<Order> getOrders(String userId){
        List<Order> orders = (List<Order>) orderRepository.findByUserId(userId);

        return orders;
    }

    public Map<String, Object> deleteOrder(String orderId){
        Optional<Order> orderList = orderRepository.findById(orderId);
        Order order = orderList.get();
        orderRepository.delete(order);

        //TODO: update Product data

        Map<String, Object> map = new HashMap<>();
        map.put("message", "order deleted successfully");
        map.put("order", order);

        return map;
    }
}
