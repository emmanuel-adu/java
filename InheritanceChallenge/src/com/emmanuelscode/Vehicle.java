package com.emmanuelscode;

public class Vehicle {

    // Fields
    private String vehicleType;
    private int speed;
    private int size;

    // Constructor
    public Vehicle() {

        this("Default Vehicle",0, 0);
    }
    public Vehicle(String vehicleType, int speed, int size) {

        this.vehicleType = vehicleType;
        this.speed = speed;
        this.size = size;
    }

    // Methods
    public void move(int speed, int size){

        System.out.println("Vehicle.move() Type: " + vehicleType
        + ". Speed: " + speed + ". Size: " + size + ".");
    }
    public void move(){

        System.out.println("Vehicle.move(): default not moving.");
    }

    // Getter
    public int getMove() {
        return speed;
    }
    public int getSize() {
        return size;
    }
    public String getVehicleType() {
        return vehicleType;
    }
}
