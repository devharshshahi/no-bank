package com.nobank.userservice.controller;

import com.nobank.userservice.model.Product;
import com.nobank.userservice.model.User;
import com.nobank.userservice.service.ProductServices;
import com.nobank.userservice.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class UserController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private ProductServices productServices;


    @GetMapping("login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/")
    public String homePage(Model model){

//        List<Product> products=(List<Product>) productServices.getProducts();
        Map<String, Object> map = new HashMap<>();

        map.put("HOME", "active");
        map.put("user", userServices.getUserByEmail("kamal@gmail.com"));
//        map.put("products", products);
        map.put("MODE","DASHBOARD");
        model.addAllAttributes(map);

        return "index";
    }

    @GetMapping("/product/{productId}")
    public String getProduct(@PathVariable String productId, Model model){
        Product product;
        return "index";
    }


}
