package com.nobank.userservice.service;

import com.nobank.userservice.model.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductServices {


    public Collection<Product> getProducts(){

        ParameterizedTypeReference<CollectionModel<Product>> ptr =
                new ParameterizedTypeReference<CollectionModel<Product>>() {};



        ResponseEntity<CollectionModel<Product>> responseEntity = new RestTemplate()
                .exchange("http://localhost:8200/products", HttpMethod.GET, null, ptr);

        if(responseEntity.getStatusCodeValue()==200)
            return responseEntity.getBody().getContent()
                    .stream()
                    .collect(Collectors.toList());

        return null;
    }

    public Product getProduct(String productId){

        Map<String, String> pathVarmap = new HashMap<>();

        pathVarmap.put("productId", productId);

        ResponseEntity<Product> responseEntity = new RestTemplate()
                .getForEntity("http://localhost:8200/products/{productId}", Product.class, pathVarmap);

        if(responseEntity.getStatusCodeValue() == 200)
            return responseEntity.getBody();
        return null;
    }

    public Product createProduct(String userId, Product product){

        return null;
    }
    public Product updateProduct(String productId, Product Product){

        return null;
    }

    public Product deleteProduct(String productId){

        return null;
    }
}
