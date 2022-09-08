package com.emmanuelscode;

public class Table {

    private Dimension dimension;
    private String color;
    private int legs;

    public Table(Dimension dimension, String color, int legs) {
        this.dimension = dimension;
        this.color = color;
        this.legs = legs;
    }

    public void pickUpRemote(){
        System.out.println("Picking up remote from table");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }
}
