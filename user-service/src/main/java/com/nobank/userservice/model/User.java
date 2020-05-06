package com.nobank.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private long aadhar_no;
    private long phone;
    private long ac;

    public User(){}

    public User(String id, String name, String email, long aadhar_no, long phone, long ac) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.aadhar_no = aadhar_no;
        this.phone = phone;
        this.ac = ac;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getAc() {
        return ac;
    }

    public void setAc(long ac) {
        this.ac = ac;
    }

}
