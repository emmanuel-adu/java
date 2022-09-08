package com.emmanuelscode;

public abstract class Animal {
    // Field
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Methods
    public abstract void eat();
    public abstract void breath();

    // Getters
    public String getName() {
        return name;
    }
}
