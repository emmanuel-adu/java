package com.emmanuelscode;

public class Hamburger {
    // private fields
    private String name;
    private String meat;
    private double price;
    private  String breadRollType;

    // Constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    // Business method: add up to four additions to the hamburger
    public void addHamburgerAddition1(String name, double price){
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition2(String name, double price){
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition3(String name, double price){
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition4(String name, double price){
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    // Business method: Total price of the hamburger
    public double itemizehamburger(){
        return price;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}
