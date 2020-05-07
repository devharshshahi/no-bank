package com.nobank.orderservice.proxy;

import com.nobank.orderservice.model.Product;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient(name = "product-service")
//@FeignClient
public interface ProductProxy {

    @GetMapping("/product-service/products/{productId}")
    public Product retireveProduct(@PathVariable("productId") String productId);

}
