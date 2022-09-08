package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

        // Vehicle
//        Vehicle car = new Vehicle("Car",30, 10);
//        car.move(60, 5);
//        Vehicle defaultVehicle = new Vehicle();
//        defaultVehicle.move();

        // Car
//        Car car = new Car("Car", 40, 10, 6, "North West", "Black");
//        car.move("Car", 60, 9);

        // Tesla
        Car tesla = new Tesla("Car", 40, 10,6,"North West","Black", "Trojan Horse");
        tesla.move("Electric Car", 40, 10);




    }
}