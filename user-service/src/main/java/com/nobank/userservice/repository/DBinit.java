package com.nobank.userservice.repository;

import com.nobank.userservice.model.Account;
import com.nobank.userservice.model.Address;
import com.nobank.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DBinit implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();



        List<String> roles = new ArrayList<>();
        roles.add("user");
        User user = new User("Kamal",
                "kamal@gmail.com",
                null,
                null,
                Long.parseLong("123456789098"),
                Long.parseLong("9876567656"),
                new Address("premnager","Dehradun", "Uttrakhand",248001, "India"),
                "image",
                new BCryptPasswordEncoder().encode("password"),
                new Account(Account.Type.Saving),
                null,roles,
                null,
                1);
        userRepository.save(user);
        User user1 = new User("Harsh", "harsh@gmail.com", null, null, Long.parseLong("123450000098"),
                Long.parseLong("9800067656"),new Address("premnager","Dehradun", "Uttrakhand",248001, "India"),
                "image",new BCryptPasswordEncoder().encode("password"),new Account(Account.Type.Saving),null,roles,null,1);
        userRepository.save(user1);
        User user2 = new User("Akash", "akash.@gmail.com", null, null, Long.parseLong("123411119098"),
                Long.parseLong("9876111656"),new Address("premnager","Dehradun", "Uttrakhand",248001, "India"),
                "image",new BCryptPasswordEncoder().encode("password"),new Account(Account.Type.Saving),null,roles,null,1);
        userRepository.save(user2);

        User user3 = userRepository.findByEmail("kamal@gmail.com");

        System.out.println(user3.getPassword());
        System.out.println(user3.toString());
    }
}
