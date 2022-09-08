package com.emmanuelscode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/** Linked List: each element on the list points to the next element*/
public class Demo {
    public static void main(String[] args) {
        // Creating a linkedList
        LinkedList<String> placesToVisit = new LinkedList<String>();

        /*Add Cities in order*/
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

        /* Add city using linkedList function */
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//        printList(placesToVisit);

        // Insert a new node to the list
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);

        // Remove a node from the list
//        placesToVisit.remove(4);
//        printList(placesToVisit);



    }

    // Print linked-list
    private static void printList(LinkedList<String> linkedList){
        // Using iterator: Another way to access or go a List
        Iterator<String> i = linkedList.iterator();
        // i.hasNext() -> true if iterator has more elements
        while (i.hasNext()){
            // returns the next element in the iteration
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");
    }

     // Add cities in alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList , String newCity ){

        // ListIterator gives capability to move through the list in either direction
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){

            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                // linkedList[i] city = newCity are equal -> do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // ListIterator allows you to go back unlike Iterators
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                // move on next City: already done due to .next()
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }








}
