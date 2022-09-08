/*
* This is my first Java App on M1
*/

package com.emmanuelscode;
import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String intro = "Hello";
//        System.out.println(intro + " My name is Emmanuel");

        // Java variables
//        int number = 100;
//        double doubleNumber = 100.54;
//        Date date = new Date();

        // Primitive data types
//        byte theByte = -128;
//        short theShort = 23_322;
//        int theInt = 323_323_333;
//        long theLong = 3_233_233_332_233_333L;
//        float pi = 3.14F;
//        double doublePi = 3.1415;
//        boolean isHuman = true;
//        char nameInitial = 'E';

        // Non-primitive data types AKA reference types
//        String lastName = "ADU";
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getMonth());
//        // Strings
//        System.out.println(lastName.toLowerCase());
//        System.out.println(lastName.charAt(0));
//        System.out.println(lastName.contains("Adus"));
//        System.out.println(lastName.equals("ADU"));

        /* Primitive vs Reference */
        // Primitive points to the actual value
//        int a = 10;
//        int b = a;
//        a = 100;
//        System.out.println("a = " + a + " - b = " + b);
//        // Reference points to a reference point
//        Person emmanuel = new Person("emmanuel");

        // Math
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.max(3.6, 10.11));
//        System.out.println(Math.min(3.6, 10.11));
//        System.out.println(Math.PI);
//        //casting result to integer
//        System.out.println((int) Math.pow(5.0, 2));
//        System.out.println((int) Math.sqrt(25));

        // Comparison Operators
//        boolean isAdult = true;

        // IF statement
//        int age = 19;
//        if (age >= 18){
//            System.out.println(isAdult);
//        } else {
//            System.out.println(!isAdult);
//        }

        // Ternary Operator
//        int age2 = 17;
//        String message = age2 >= 18 ?
//                "I am an adult" :
//                "I am not an adult";
//        System.out.println(message);

        // Switch Statement
//        String gender = "male";
//        switch (gender.toUpperCase()){
//            case "FEMALE":
//                System.out.println("I am a female");
//                break;
//            case "MALE":
//                System.out.println("I am a male");
//                break;
//            case "IDK":
//                System.out.println("IDK");
//                break;
//            default:
//                System.out.println("Unknown Gender");
//        }

        // Arrays
//        int [] numbers = new int[3]; // array declaration with size
//        numbers[0] = 2;
//        numbers[1] = 2;
//        numbers[2] = 2;
//        System.out.println(Arrays.toString(numbers));
//        int [] numbersTwo = {2, 0, 1}; // declaration and initialization of an array
//        System.out.println(Arrays.toString(numbersTwo));
//        System.out.println(numbers.length);

        /*Loops*/
//        // for i loop
//        for (int i = 0; i < numbersTwo.length; i++){
//            System.out.println("Loop i = " + numbersTwo[i]);
//        }
//        // foreach loops
//        for (int numberTwo: numbersTwo) {
//            if (numberTwo == 1){
//                break;
//            }
//            System.out.println("Loop i = " + numberTwo);
//        }
//        // Streams
//        Arrays.stream(numbersTwo).forEach(System.out::println);
//        // While loop
//        int count = 21;
//        do {
//            System.out.println(count);
//            count++;
//        } while (count <= 40);

        // Scanner - user input from program
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName);
//
//        System.out.println("How old are you?");
//        int ageTwo = scanner.nextInt();
//        int year = LocalDate.now().minusYears(ageTwo).getYear();
//        System.out.println("You were born in " + year);
//
//        if (ageTwo < 18){
//            System.out.println("and you are not an adult");
//        } else {
//            System.out.println(" and you an adult :)");
//        }

        // Methods
//        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D', 'E'};
//        int count = countOccurences(letters, 'z');
//        System.out.println(count);

        // Objects
        Lens lensOne = new Lens("sony","85mm",true);
        Lens lensTwo = new Lens("sony","95mm",true);
        Lens lensThree = new Lens("canon","185mm",false);
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

    }

//    static class Person {
//        String name;
//        Person(String name){
//            this.name = name;
//        }
//    }

    // method
//    public static int countOccurences(char[] letters, char searchLetter){
//        int count = 0;
//        for (char letter : letters) {
//            if(letter == searchLetter){
//                count++;
//                System.out.println("its equal");
//            }
//        }
//        return count;
//    }

    // Class
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        // Constructor
        Lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

}