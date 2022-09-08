package com.emmanuelscode;

public class Rectangle {

    // Fields
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {

        // Validator
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    /**
     * Calculate width x length
     * @return area of the rectangle
     */
    public double getArea(){
        return width * length;
    }
}
