package com.nobank.userservice.repository;

import com.nobank.userservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}
