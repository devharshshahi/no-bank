package com.nobank.userservice.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class Address {

    @NotNull
    private String address;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    @Digits(integer = 6, fraction = 0, message = "must have 6 digits")
    private int pin;

    @NotNull
    private String country;

    public Address() {
    }

    public Address(String address, String city, String state, int pin, String country) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.country = country;
    }

    public String getLocality() {
        return address;
    }

    public void setLocality(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
