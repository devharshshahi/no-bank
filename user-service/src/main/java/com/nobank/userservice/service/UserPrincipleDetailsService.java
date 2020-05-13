package com.nobank.userservice.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nobank.userservice.model.User;
import com.nobank.userservice.repository.UserRepository;

@Service
public class UserPrincipleDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public UserPrincipleDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepository.findByEmail(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;

    }
}
