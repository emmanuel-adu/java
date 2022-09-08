package com.emmanuelscode;

public class Livingroom {

    // private fields
    private int squareFoot;
    private Door door;
    private Couch couch;
    private Table table;
    private TV tv;

    // Constructor
    public Livingroom(int squareFoot, Door door, Couch couch, Table table, TV tv) {
        this.squareFoot = squareFoot;
        this.door = door;
        this.couch = couch;
        this.table = table;
        this.tv = tv;
    }

    // Getter
    public int getSquareFoot() {
        return squareFoot;
    }

    public Door getDoor() {
        return door;
    }

    public Couch getCouch() {
        return couch;
    }

    public Table getTable() {
        return table;
    }

    public TV getTv() {
        return tv;
    }

    /**
     * Go to the living room to watch TV
     */
    public void goToLivingRoom(){
        door.openDoor();
        couch.sit();
        table.pickUpRemote();
        tv.turnOnTV();
    }
}
