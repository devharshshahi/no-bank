package com.nobank.productservice.controller;

import com.nobank.productservice.model.Holder;
import com.nobank.productservice.model.Product;
import com.nobank.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping(value = "/")
    public List<Product> getProducts(){
        List<Product> products =  productService.getProducts();
        //TODO: check if products list is empty or not

        return products;
    }

    @GetMapping(value = "/{productId}")
    public Product getProduct(@PathVariable String productId){

        //TODO: check is product exists or not
        Product product = productService.getProduct(productId);

        return product;
    }

    @GetMapping(value = "/search/{name}")
    public List<Product> getProductByName(@PathVariable String name){

        List<Product> products = productService.getProductsWithName(name);

        //TODO: check if list is empty or not

        return products;
    }

    @PutMapping(value = "/{productId}")
    public Map<String,Object> updateProduct(@PathVariable String productId, @RequestBody int quantity){
        //TODO: check if product exists or not

        Map<String, Object> map = productService.updateProduct(productId, quantity);

        return map;
    }

    @DeleteMapping(value = "/{productId}")
    public Map<String, Object> deleteProduct(@PathVariable String productId){
        //TODO: check if product exists or not

        return productService.deleteProduct(productId);
    }

    @GetMapping(value = "/{productId}/from/{holder}/quantity/{quantity}")
    public Product getProduct(@PathVariable String productId, @PathVariable String holder, @PathVariable int quantity){
        Product product = productService.getProduct(productId);
        List<Holder> holder1 = product.getHolders();
        Holder holder2=new Holder();
        for(Holder h: holder1){
            if(h.getHolder().matches(holder)){
                holder2 = h;
                break;
            }
        }
        if(holder2.getQuantity()<quantity){
            return null;
        }
        return product;

    }

}
