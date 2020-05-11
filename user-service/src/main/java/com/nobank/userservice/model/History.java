package com.nobank.userservice.model;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class History {

    static enum TransferType{
        Debit, Credit
    }

    @NotNull
    private Date date;

    @NotNull
    private double funds;

    @NotNull
    private String otherUser;

    @NotNull
    private TransferType type;

    public History(){}

    public History(Date date, double funds, String otherUser, TransferType type) {
        this.date = date;
        this.funds = funds;
        this.otherUser = otherUser;
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

    public String getUser() {
        return otherUser;
    }

    public void setUser(String otherUser) {
        this.otherUser = otherUser;
    }

    public TransferType getType() {
        return type;
    }

    public void setType(TransferType type) {
        this.type = type;
    }
}
