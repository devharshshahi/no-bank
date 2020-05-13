package com.nobank.userservice.model;

public class Address {


    private String address;

    private String city;

    private int pin;


    private String country;

    public Address() {
    }

    public Address(String address, String city, int pin, String country) {
        this.address = address;
        this.city = city;
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

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", pin=" + pin + ", country="
				+ country + "]";
	}
    
    
}
