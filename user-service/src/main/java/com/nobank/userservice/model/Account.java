package com.nobank.userservice.model;

public class Account {

    public enum Type {
        Saving, Current
    }

    private long ac_no;

    private double balance;

    private Type type;

    public Account(){}

    public Account(Type type,double balance) {
        this.ac_no = System.currentTimeMillis();
        this.type = type;
        this.balance = balance;
    }

    public long getAc_no() {
        return ac_no;
    }

    public void setAc_no(long ac_no) {
        this.ac_no = ac_no;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

	@Override
	public String toString() {
		return "Account [ac_no=" + ac_no + ", balance=" + balance + ", type=" + type + "]";
	}
    
    
}
