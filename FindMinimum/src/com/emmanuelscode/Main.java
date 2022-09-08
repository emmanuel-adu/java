package com.emmanuelscode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] inputArray = readIntegers(5);

        System.out.println(Arrays.toString(inputArray));
        System.out.println("Minimum number = " + findMin(inputArray));
    }

    private static int[] readIntegers(int capacity){

        System.out.println("Enter " + capacity + " integer values.\r");
        int [] myArray = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            myArray[i] = Integer.parseInt(scanner.nextLine());
        }
        return myArray;
    }

    private static int findMin(int [] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }

        }
        return min;
    }
}