package com.emmanuelscode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myNumbers = getIntegers(5);
        printArray(myNumbers);
        int[] sortedNumbers = sortIntegers(myNumbers);
        printArray(sortedNumbers);
    }

    /**
     * Returns array based on users input
     * @param number length of array
     * @return array of numbers
     */
    private static int[] getIntegers(int number){

        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(myInput.nextLine());
        }

        return values;
    }

    /**
     * Prints an array
     * @param myArray
     */
    private static void printArray( int[] myArray){
        System.out.println(Arrays.toString(myArray));
    }

    /**
     * Sort the array from highest to lowest
     * @param myArray array input
     * @return
     */
    private static int[] sortIntegers (int [] myArray){

        // Start out by cloning our array into our sorted array
//        int [] sortedArray = new int [myArray.length];
//        for(int i=0; i<myArray.length; i++) {
//            sortedArray[i] = myArray[i];
//        }
        int [] sortedArray = Arrays.copyOf(myArray, myArray.length);

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                // If current element is less than next element then swap both elements
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i]; // store the current element in temp variable
                    sortedArray[i] = sortedArray[i + 1]; // current element equals higher value in next element
                    sortedArray[i + 1] = temp; // swap next element to lower value temp variable
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}