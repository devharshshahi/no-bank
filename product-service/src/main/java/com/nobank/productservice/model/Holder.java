package com.nobank.productservice.model;

public class Holder {

    private String holder;
    private int quantity;

    public Holder(){}

    public Holder(String holder, int quantity) {
        this.holder = holder;
        this.quantity = quantity;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
