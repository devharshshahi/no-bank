package com.nobank.orderservice.controller;

import com.nobank.orderservice.model.Order;
import com.nobank.orderservice.model.Product;
import com.nobank.orderservice.service.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderServices orderServices;

    @PostMapping(value = "/")
    public Order createOrder(@RequestBody Order order){
        Product product = order.getProduct();
        int quantity = order.getQuantity();
        String userId = order.getUserId();

        //Todo: check user exists or not


        return orderServices.placeOrder(product, userId, quantity);
    }

    @GetMapping(value = "/{userId}")
    public List<Order> getOrders(@PathVariable String userId){

        //TODO: check user exists or not

       List<Order> orders =  orderServices.getOrders(userId);

       return orders;
    }

    @DeleteMapping(value = "/{userId}")
    public Map<String, Object> deleteUser(@PathVariable String orderId){
        //TODO: check user exists or not

        //TODO: check user has that order or not


        return orderServices.deleteOrder(orderId);
    }
}
