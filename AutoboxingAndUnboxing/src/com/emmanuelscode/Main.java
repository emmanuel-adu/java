package com.emmanuelscode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // What can be done with array
        String [] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Emmanuel");

        // What we cannot do: ArrayList only takes class reference not primitive
//        ArrayList<int> intArrayList = new ArrayList<int>();

        // Autoboxing
        Integer integerValue = 524; // Integer.valueOf(524)
        // Unboxing
        int myInt = integerValue; //myInt.intValue()

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            // Autoboxing
            myDoubleValue.add(dbl);
        }

        for (int i = 0; i < myDoubleValue.size(); i++) {
            // Unboxing
            double value = myDoubleValue.get(i);
            System.out.println(i + " --> " + value);
        }


    }
}