package com.emmanuelscode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(7);
        // Outerclass.InnerClass
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);



    }
}