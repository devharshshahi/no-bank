package com.nobank.orderservice.controller;


import com.nobank.orderservice.model.Bill;
import com.nobank.orderservice.model.Order;
import com.nobank.orderservice.model.Product;
import com.nobank.orderservice.service.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderServices orderServices;

    @PostMapping(value = "/{productId}")
    public Order createOrder(@PathVariable("productId") String productId, @ModelAttribute("quantity") int quantity, @ModelAttribute("userId") String userId, @ModelAttribute("holder") String holder){

        //Todo: check user exists or not


        // Get Product from Products
        Map<String,String> uriVarable =new HashMap<>();
        uriVarable.put("productId", productId);
        uriVarable.put("holder", holder);
        uriVarable.put("quantity", String.valueOf(quantity));

        ResponseEntity<Product> responseEntity = new RestTemplate()
                .getForEntity("http://localhost:8200/products/{productId}/from/{holder}/quantity/{quantity}", Product.class, uriVarable);


        Product product = responseEntity.getBody();

        // Get Bill
        uriVarable = new HashMap<>();
        uriVarable.put("productId", productId);
        uriVarable.put("userId", userId);

        ResponseEntity<Bill> responseEntity1 = new RestTemplate()
                .getForEntity("http://localhost:8500/products/{productId}/user/{userId}", Bill.class, uriVarable);

        Bill bill = responseEntity1.getBody();

        if(product!=null || bill != null){
            product.setHolder(holder);
            return orderServices.placeOrder(product, userId, quantity, bill);
        }
        return null;
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
