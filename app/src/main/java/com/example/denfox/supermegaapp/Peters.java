package com.example.denfox.supermegaapp;

/**
 * Created by Peter on 08.07.2017.
 */

public class Peters {
    private String firstName;
    private String lastName;
    private String fullName;

    public Peters() {
        firstName = "Dima";
        lastName = "Peters";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
