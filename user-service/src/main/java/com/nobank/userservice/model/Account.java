package com.nobank.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

public class Account {

    static enum Type {
        Saving, Current
    }
    private long ac_no=System.currentTimeMillis();
    private Type type;

    public Account(){}

    public Account(Type type) {
        this.ac_no = System.currentTimeMillis();
        this.type = type;
    }

    public long getAc_no() {
        return ac_no;
    }

    public void setAc_no() {
        this.ac_no = System.currentTimeMillis();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
