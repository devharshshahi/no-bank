package com.nobank.feeservice.service;

import com.nobank.feeservice.model.Bill;
import com.nobank.feeservice.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingServices {

    @Autowired
    private BillRepository billRepository;

    public Bill getBill(String productId, String userId){

        return billRepository.findByProductIdAndUserId(productId, userId);

    }

    public Bill postBill(Bill bill){
        return billRepository.save(bill);
    }

    public Bill updateBill(String productId, String userId, Bill newBill){
        Bill bill = billRepository.findByProductIdAndUserId(productId, userId);

        bill.setDividend(newBill.getDividend());
        bill.setFace_value(newBill.getFace_value());
        bill.setMarket_value(newBill.getMarket_value());

        return billRepository.save(bill);
    }
}
