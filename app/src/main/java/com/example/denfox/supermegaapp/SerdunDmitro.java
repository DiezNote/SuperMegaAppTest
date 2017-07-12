package com.example.denfox.supermegaapp;

/**
 * Created by User on 09.07.2017.
 */

public class SerdunDmitro {
    private final String name = "Dmitro Serdun";
    private static final SerdunDmitro ourInstance = new SerdunDmitro();

    public static SerdunDmitro getInstance() {
        return ourInstance;
    }

    private SerdunDmitro() {
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
