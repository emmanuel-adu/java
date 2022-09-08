package com.emmanuelscode;

// Interface exists to define the methods that will be implemented by the class
public interface ITelephone {
/*
     We don't write code on the interface
     Creating signature of interface --> methods that form the interface
     These are the methods that a class that will implement:
 */

    // Private and public are useless for interface
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
