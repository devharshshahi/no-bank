package com.nobank.orderservice.proxy;


import com.nobank.orderservice.model.Bill;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient()
@RibbonClient(name = "fee-service")
public interface BillProxy {

    @GetMapping("fee-service/bill/{productId}")
    public Bill retrieveBill(@PathVariable("productId") String productId);

    @PostMapping("/fee-service/bill/")
    public Bill postBill(@RequestBody Bill bill);

}
