package com.nobank.orderservice.model;


public class Product {

    private String id;
    private String name;
    private String holder;
    private int available;

    public Product(){}

    public Product(String id, String name, String holder, int available) {
        this.id = id;
        this.name = name;
        this.holder = holder;
        this.available = available;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
