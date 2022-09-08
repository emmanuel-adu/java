package com.emmanuelscode;

public class Contact {

    // Private field
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Creates a new contact record from constructor
     * @param name name of contact
     * @param phone phone number of contact
     * @return returns a contact object by instantiating the constructor
     */
    public static Contact createContact(String name, String phone){
        return new Contact(name, phone);
    }
}
