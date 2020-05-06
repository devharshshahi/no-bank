package com.nobank.userservice.service;

import com.nobank.userservice.model.Account;
import com.nobank.userservice.model.User;
import com.nobank.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUsers(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    public User getUser(String id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    public User updateUser(String id, User user){
        Optional<User> newUser = userRepository.findById(id);
        User userdata = newUser.get();

        userdata.setAadhar_no(user.getAadhar_no());
        userdata.setEmail(user.getEmail());
        userdata.setPhone(user.getPhone());

        userRepository.save(userdata);

        return userdata;
    }

    public User deleteUser(String id){
        Optional<User> user = userRepository.findById(id);
        userRepository.delete(user.get());

        return user.get();
    }
}
