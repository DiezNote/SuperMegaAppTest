package com.example.denfox.supermegaapp;

/**
 * Created by Peters on 08.07.2017.
 */

public class Peters {
    private String firstName;
    private String lastName;
    private String fullName;

    public Peters() {
        firstName = "Dima";
        lastName = "Peters";
        fullName = fullName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return fullName;
    }

    private String fullName() {
        return firstName + " " + lastName;
    }
}
