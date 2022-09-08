package com.emmanuelscode;

/**
 * Car class represents template
 */
public class Car {

    // Field for my Car class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Getter and Setters
    public void setModel(String model){
        // Validator
        String validModel = model.toLowerCase();
        if(validModel.matches("[a-z]+")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return model;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }
    public int getDoors() {
        return doors;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels(){
        return wheels;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getEngine(){
        return engine;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
