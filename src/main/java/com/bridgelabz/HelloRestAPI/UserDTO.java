package com.bridgelabz.HelloRestAPI;

public class UserDTO {

    private String firstName;
    private String lastName;

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}