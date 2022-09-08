package com.emmanuelscode;

/**
 * Person Class
 */
public class Person {
    // Fields
    private String firstName;
    private String lastName;
    private int age;

    // Getter and Setters
    public void setFirstName(String firstName){

        if( firstName.isEmpty()){
            this.firstName = "Empty Name ";
        } else {
            this.firstName = firstName;
        }
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){

        if(lastName.isEmpty()){
            this.lastName = " Empty Lastname";
        } else {
            this.lastName = lastName;
        }
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age){
        // Validator
        if (age >= 0 && age <= 200) {
            this.age = age;
        } else {
            this.age = -2;
        }
    }
    public int getAge(){
        return age;
    }

    // Teenager method
    public boolean isTeen(){
        return age >= 12 && age < 20;
    }
}
