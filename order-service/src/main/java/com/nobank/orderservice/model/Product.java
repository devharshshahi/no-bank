package com.nobank.orderservice.model;

public class Product {

    private String id;
    private String name;
    private String holder;

    public Product(){}

    public Product(String id, String name, String holder) {
        this.id = id;
        this.name = name;
        this.holder = holder;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

}
