package com.nobank.userservice.model;

public class Address {

    String locality;
    String city;
    String state;
    int pin;
    String country;

    public Address() {
    }

    public Address(String locality, String city, String state, int pin, String country) {
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.country = country;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
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
