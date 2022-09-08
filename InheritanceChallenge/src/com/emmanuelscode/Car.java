package com.emmanuelscode;

public class Car extends Vehicle {

    // fields
    private int gear;
    private String steering;
    private String color;

    // Constructor
    public Car(String vehicleType ,int speed, int size, int gear, String steering, String color) {

        super(vehicleType ,speed, size);
            this.gear = gear;
            this.steering = steering;
            this.color = color;
    }

    // Method
    public void carDetail(int gear, String steering, String color){

        System.out.println("Number of Gears: " + gear + ". Steering Direction: "
                        + steering + ". Color: " + color + ".");
    }
    private void racing(){

        System.out.println("Racing");
    }

    public void move(String vehicleType ,int speed, int size) {

        // Calling move() methods in parent class
        super.move(); // default
        super.move(speed, size); // Vehicle

        // Calling methods in this class
        System.out.println(vehicleType + ".move()");
        racing();
        carDetail(gear, steering, color);
    }

    @Override
    public void move() {

        super.move();
    }

    // Getters
    public int getGear() {
        return gear;
    }

    public String getSteering() {
        return steering;
    }

    public String getColor() {
        return color;
    }
}
