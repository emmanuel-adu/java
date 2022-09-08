package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

        // Instantiating classes
        Car porsche = new Car();
        Person emmanuel = new Person();

        // porsche
        porsche.setModel("Panamera");
        System.out.println("Model is " + porsche.getModel());

        // emmanuel
        emmanuel.setFirstName("Emmanuel");
        emmanuel.setLastName("Adu");
        emmanuel.setAge(12);
        System.out.println(emmanuel.getFirstName() + emmanuel.getLastName() +
                " age is " + emmanuel.getAge() + " Teenage Status: " + emmanuel.isTeen());




    }
}