package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

        // Animal
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        // Dog
        Dog dog = new Dog("German Shepherd", 8, 25, 2,
                4, 1,40, "long ruff" );
//        dog.eat();
//        dog.walk();
//        dog.run();

        // Fish
        Fish fish = new Fish("Gold Fish", 1, 2, 2,1,2);
        fish.swim(4);
    }
}