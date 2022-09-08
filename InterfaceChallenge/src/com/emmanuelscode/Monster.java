package com.emmanuelscode;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    // Field
    private String name;
    private int hitPoints;
    private int strength;

    // Constructor
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    // Creating stubs (empty methods) by implementing methods
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){

            // If there is data
            this.name = savedValues.get(0); // add name to list
            this.hitPoints = Integer.parseInt(savedValues.get(1)); // add hitPoints to list
            this.strength = Integer.parseInt(savedValues.get(2));
        }

    }
}
