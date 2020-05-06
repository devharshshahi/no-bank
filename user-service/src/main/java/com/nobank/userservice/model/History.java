package com.nobank.userservice.model;

import java.util.Date;

public class History {

    static enum TransferType{
        Debit, Credit
    }

    Date date;
    double funds;
    User user;
    TransferType type;

    public History(){}

    public History(Date date, double funds, User user, TransferType type) {
        this.date = date;
        this.funds = funds;
        this.user = user;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TransferType getType() {
        return type;
    }

    public void setType(TransferType type) {
        this.type = type;
    }
}
