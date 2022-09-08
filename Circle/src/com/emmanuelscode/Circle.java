package com.emmanuelscode;

public class Circle {

    // Fields
    private double radius;

    // Constructor
    public Circle(double radius) {

        // Validator
        if (radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Methods
    public double getArea(){
        return ( Math.pow(radius, 2.0) * Math.PI );
    }
}
