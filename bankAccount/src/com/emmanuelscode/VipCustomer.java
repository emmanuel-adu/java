package com.emmanuelscode;

/**
 * Vip Customer Class
 */
public class VipCustomer {

    // private fields
    private String name;
    private int creditLimit;
    private String emailAddress;

    // constructor
    public VipCustomer(){
        this("Default Name", 700, "default@gmail.com");
        System.out.println("Empty Vip Constructor called");
    }
    public VipCustomer(int creditLimit, String emailAddress) {
        this("Default Name", creditLimit, emailAddress);
    }
    public VipCustomer(String name, int creditLimit, String emailAddress){
        System.out.println("Vip Customer constructor with parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
