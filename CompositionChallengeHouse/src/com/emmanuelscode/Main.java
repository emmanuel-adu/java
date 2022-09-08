package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

        Door door = new Door(new Dimension(12,6,2), "Brown");
        Couch couch = new Couch(new Dimension(50,25, 10), "Beige" , "Leather");
        Table table = new Table(new Dimension(30, 90, 10), "Black", 4);
        TV tv = new TV("Sony", new Resolution(35, 65));

        Livingroom livingroom = new Livingroom(500, door, couch, table, tv);
        livingroom.goToLivingRoom();


    }
}