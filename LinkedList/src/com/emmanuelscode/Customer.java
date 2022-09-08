package com.emmanuelscode;

public class Customer {

    // Field
    private String name;
    private double balance;

    // Constructor
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
