package com.emmanuelscode;

/**
 * Customer Account Class
 */
public class Account {

    // Private fields
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // Constructors
    public Account(){
        // this is calling the other Account class
        this("123", 2.50, "Default name", "Default address",
                "Default phone");
        System.out.println("Empty Constructor called");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("999999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Deposit and withdraw methods
    public void depositFunds(double amount){

        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + balance);
    }
    public void withdrawFunds(double amount){

        if (amount > balance ){
            System.out.println("Only " + balance + " available. Withdrawal not processed ");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance is " + balance);
        }
    }

    // Getters and Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
