package com.nobank.productservice.controller;

import com.nobank.productservice.model.Bill;
import com.nobank.productservice.model.Data;
import com.nobank.productservice.model.Holder;
import com.nobank.productservice.model.Product;
import com.nobank.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/")
    public ResponseEntity<Data> createProduct(@RequestBody Data data, @RequestHeader Map<String , String> header){

        Bill bill = new Bill();

        Product product = productService.createProduct(data.getProduct());
        bill.setProductId(product.getId());

        ResponseEntity<Bill> responseEntity= new RestTemplate()
                .postForEntity("http://localhost:8500/fee", bill, Bill.class);
        Data data1 = new Data();
        data1.setProduct(product);
        data1.setBill(bill);

        //TODO: get userid from auth
        //bill.setUserId();

        return new ResponseEntity<Data>(HttpStatus.CREATED);

    }

    @GetMapping(value = "/")
    public List<Product> getProducts( @RequestHeader Map<String , String> header){
        List<Product> products =  productService.getProducts();
        //TODO: check if products list is empty or not

        return products;
    }

    @GetMapping(value = "/{productId}")
    public Product getProduct(@PathVariable String productId, @RequestHeader Map<String , String> header){

        //TODO: check is product exists or not
        Product product = productService.getProduct(productId);

        return product;
    }

    @GetMapping(value = "/search/{name}")
    public List<Product> getProductByName(@PathVariable String name,  @RequestHeader Map<String , String> header){

        List<Product> products = productService.getProductsWithName(name);

        //TODO: check if list is empty or not

        return products;
    }

    @PutMapping(value = "/{productId}")
    public Map<String,Object> updateProduct(@PathVariable String productId, @RequestBody int quantity, @RequestHeader Map<String , String> header){
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
    public Product getProduct(@PathVariable String productId, @PathVariable String holder, @PathVariable int quantity,  @RequestHeader Map<String , String> header){
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
