package com.emmanuelscode;

/**
 * Base Class Car
 */
class Car {

    // private fields
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String names;

    public Car(int cylinders, String names) {
        this.cylinders = cylinders;
        this.names = names;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake (){
        return "Car -> brake()";
    }

    // getters
    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Cobalt extends Car {

    public Cobalt(int cylinders, String names) {
        super(4, "Cobalt");
    }

    @Override
    public String startEngine() {
        return  "Cobalt -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Cobalt -> accelerate()";
    }

    @Override
    public String brake() {
        return "Cobalt -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String names) {
        super(4, "Ford");
    }

    @Override
    public String startEngine() {
        return  "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Cobalt cobalt = new Cobalt(6, "Chevy");
        System.out.println(cobalt.startEngine());
        System.out.println(cobalt.accelerate());
        System.out.println(cobalt.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
}