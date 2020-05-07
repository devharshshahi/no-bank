package com.nobank.feeservice.controller;

import com.nobank.feeservice.model.Bill;
import com.nobank.feeservice.service.BillingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/fee")
public class BillController {

    @Autowired
    private BillingServices billingServices;

    @GetMapping(value = "/product/{productId}")
    public Bill getBill(@PathVariable String productId){

        //TODO: find if product exists or not

        return billingServices.getBill(productId);
    }

    @GetMapping(value = "/product/{productId}/user/{userId}")
    public Bill getBill(@PathVariable String productId, @PathVariable String userId){
        // TODO: find user exists or not and user has product or not


        return billingServices.getBill(productId, userId);
    }

    @PutMapping(value = "/product/{productId}/user/{userId}")
    public Bill updateBill(@PathVariable String productId, @PathVariable String userId, @RequestBody Bill bill){

        //TODO: find user exists or not and user has this product or not

        return billingServices.updateBill(productId, userId, bill);
    }

}
