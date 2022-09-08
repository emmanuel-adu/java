package com.emmanuelscode;

public class DeskPhone implements ITelephone {

    // Field
    private int myNumber;
    private boolean isRinging;

    // Constructor
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // Implement the methods from the Abstract class
    // Must implement all methods
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing + " + phoneNumber + " on desk-phone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            return false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
