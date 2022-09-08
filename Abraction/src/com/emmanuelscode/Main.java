package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Red");
        parrot.breath();
        parrot.eat();
        parrot.fly();

    }
}