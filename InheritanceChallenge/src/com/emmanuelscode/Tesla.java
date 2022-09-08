package com.emmanuelscode;

public class Tesla extends Car {

    // Fields
    private String batteryType;

    // Constructor
    public Tesla(String vehicleType ,int speed, int size, int gear, String steering, String color, String batteryType) {
        super(vehicleType ,speed, size, gear, steering, color);
        this.batteryType = batteryType;
    }

    public void teslaBatteryType(String batteryType) {
        // Tesla
        System.out.println("Battery Type: " + batteryType);
    }

    @Override
    public void move(String vehicleType, int speed, int size) {
        super.move(vehicleType, speed, size);
        teslaBatteryType(batteryType);
    }

    // getter
    public String getBatteryType() {
        return batteryType;
    }
}
