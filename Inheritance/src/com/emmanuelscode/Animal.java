package com.emmanuelscode;

/**
 * Animal Class
 */
public class Animal {

    // Constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Methods
    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    // Private field for animal
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
}
