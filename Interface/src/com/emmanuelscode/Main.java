package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

        // Define the interface
        ITelephone emmanuelsPhone;
//        DeskPhone emmanuelsPhone;

        // Instantiating the class
        emmanuelsPhone = new DeskPhone(123123);
        emmanuelsPhone.powerOn();
        emmanuelsPhone.callPhone(123123);
        emmanuelsPhone.answer();

        // Mobile phone
        emmanuelsPhone = new MobilePhone(32132);
//        emmanuelsPhone.powerOn();
        emmanuelsPhone.callPhone(32132);
        emmanuelsPhone.answer();



    }
}