package com.emmanuelscode;

public class Cuboid extends Rectangle{

    // Fields
    private double height;

    // Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);

        // Validator
        if ( height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getters
    public double getHeight() {
        return height;
    }

    /**
     * Multiplies rectangle's area * cuboid height
     * @return Cuboid volume
     */
    public double getVolume() {
        return super.getArea() * height;
    }
}
