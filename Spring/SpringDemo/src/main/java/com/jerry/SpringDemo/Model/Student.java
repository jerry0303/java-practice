package com.jerry.SpringDemo.Model;

public class Student {

    public Student(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /*public String getFirstName() {
        return firstName;
    }*/

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;


}
