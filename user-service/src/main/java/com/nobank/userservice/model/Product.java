package com.nobank.userservice.model;

public class Product {

    private String productId;
    private String Bill;
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
