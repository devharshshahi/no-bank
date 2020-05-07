package com.nobank.feeservice.repository;

import com.nobank.feeservice.model.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillRepository extends MongoRepository<Bill, String> {
    Bill findByProductIdAndUserId(String productId, String userId);
    Bill findByProductIdAndUserIdIsNull(String productId);
}
