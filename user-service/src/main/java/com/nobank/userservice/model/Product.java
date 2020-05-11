package com.nobank.userservice.model;

import javax.validation.constraints.NotNull;

public class Product {

    @NotNull
    private String productId;

    @NotNull
    private String Bill;

    @NotNull
    private int quantity;

    public Product(){}

    public Product(String productId, String bill, int quantity) {
        this.productId = productId;
        Bill = bill;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBill() {
        return Bill;
    }

    public void setBill(String bill) {
        Bill = bill;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
