package com.emmanuelscode;

public class Couch {

    private Dimension dimension;
    private String color;
    private String type;

    public Couch(Dimension dimension, String color, String type) {
        this.dimension = dimension;
        this.color = color;
        this.type = type;
    }

    public void sit(){
        System.out.println("Sitting down on couch");
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
