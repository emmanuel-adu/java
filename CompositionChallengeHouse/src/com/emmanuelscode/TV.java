package com.emmanuelscode;

public class TV {

    private String manufacturer;
    private Resolution resolution;

    public TV(String manufacturer, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void turnOnTV(){
        System.out.println("Turning on TV");
    }
}
