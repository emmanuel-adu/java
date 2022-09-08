package com.emmanuelscode;

public class Door {
    private final Dimension dimension;
    private final String color;

    public Door(Dimension dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }

    public void openDoor(){
        System.out.println("Open the door");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }
}
