package com.emmanuelscode;

public class Cylinder extends Circle {

    // Field
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);

        // Validator
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Method
    public double getVolume(){
        return getArea() * height;
    }
}
