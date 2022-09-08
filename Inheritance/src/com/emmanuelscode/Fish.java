package com.emmanuelscode;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("Fish is resting");
    }

    private void moveMuscles(){
        System.out.println("muscle moving");
    }

    private void moveBackFin(){
        System.out.println("fins moving");
    }

    @Override
    public void move(int speed) {
        System.out.println("fish moving");
    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        move(speed);
    }
}
