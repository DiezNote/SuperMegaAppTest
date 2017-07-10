package com.example.denfox.supermegaapp;

public class Provotorov {

    private String myName = "Vadim";
    private String myLastName = "Provotorov";

    public String getMyName() {
        return myName;
    }

    public String getMyLastName() {
        return myLastName;
    }

    public String greetPlebs() {
        return "Ave " + getMyName() + " " + getMyLastName() + "!";
    }

}
