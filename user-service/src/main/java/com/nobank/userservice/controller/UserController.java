package com.nobank.userservice.controller;

import com.nobank.userservice.model.User;
import com.nobank.userservice.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping(value = "/")
    public User createUser(@RequestBody User user){

        return userServices.createUser(user);
    }

    @GetMapping(value = "/")
    public List<User> getUsers(){
        return userServices.getUsers();
    }

    @GetMapping(value = "/{userId}")
    public User getUser(@PathVariable String userId){
        //TODO: check user Exists or not

        return userServices.getUser(userId);
    }

    @PutMapping(value = "/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody User user){
        //TODO: check User exists or not

        return userServices.updateUser(userId, user);
    }

    @DeleteMapping(value = "/{userId}")
    public User deleteUser(@PathVariable String userId){

        //TODO: check user exists or not

        return userServices.deleteUser(userId);
    }

}
