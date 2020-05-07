package com.nobank.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private long aadhar_no;
    private String imageUrl;
    private long phone;
    private Address address;
    private Account account;
    private List<Product> forSale;
    private List<Product> productId;
    private List<History> history;

    public User(){}

    public User(String id, String name, String email, List<Product> productId,List<Product> forSale,
                long aadhar_no, long phone, Address address, String imageUrl,
                Account account, List<History> history) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.productId = productId;
        this.aadhar_no = aadhar_no;
        this.phone = phone;
        this.address = address;
        this.imageUrl = imageUrl;
        this.account = account;
        this.history = history;
    }

    public List<Product> getForSale() {
        return forSale;
    }

    public void setForSale(List<Product> forSale) {
        this.forSale = forSale;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

    public List<Product> getProductId() {
        return productId;
    }

    public void setProductId(List<Product> productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
