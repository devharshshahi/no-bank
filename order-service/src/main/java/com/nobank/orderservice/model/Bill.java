package com.nobank.orderservice.model;

public class Bill {

    private double market_value;
    private int quantity;
    private double investment;
    private double income_per_share;
    private double annual_income;
    private double rate_of_return;

    public Bill(){}

    public Bill(double market_value, int quantity, double investment, double income_per_share, double annual_income, double rate_of_return) {
        this.market_value = market_value;
        this.quantity = quantity;
        this.investment = investment;
        this.income_per_share = income_per_share;
        this.annual_income = annual_income;
        this.rate_of_return = rate_of_return;
    }

    public double getMarket_value() {
        return market_value;
    }

    public void setMarket_value(double market_value) {
        this.market_value = market_value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public double getIncome_per_share() {
        return income_per_share;
    }

    public void setIncome_per_share(double income_per_share) {
        this.income_per_share = income_per_share;
    }

    public double getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(double annual_income) {
        this.annual_income = annual_income;
    }

    public double getRate_of_return() {
        return rate_of_return;
    }

    public void setRate_of_return(double rate_of_return) {
        this.rate_of_return = rate_of_return;
    }
}
