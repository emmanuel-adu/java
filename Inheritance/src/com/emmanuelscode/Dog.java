package com.emmanuelscode;

public class Dog extends Animal {

    // private fields for dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Dog Constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // method
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // calling private method chew
        super.eat(); // calling Animal.eat()
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveleg(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called. Dog is moving at " + speed);
        moveleg(speed);
        super.move(speed);
    }
}
