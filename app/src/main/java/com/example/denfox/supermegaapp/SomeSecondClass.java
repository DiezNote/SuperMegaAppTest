package com.example.denfox.supermegaapp;

/**
 * Created by denfox on 7/4/17.
 */



public class SomeSecondClass {

    private boolean isTrue;
    private boolean isRealTrue;

    /**
     * Constructor with two parameters.
     * @param isTrue indicates is that true
     * @param isRealTrue indicates is that REALLY true
     */
    public SomeSecondClass(boolean isTrue, boolean isRealTrue) {
        this.isTrue = isTrue;
        this.isRealTrue = isRealTrue;
    }

    public SomeSecondClass(boolean isTrue) {
        this.isTrue = isTrue;
    }

    public void dontDoSomething() {
    }

    public void doSomethingElse() {

    }

    public void doSomethingTruly() {

    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public boolean isRealTrue() {
        return isRealTrue;
    }

    public void setRealTrue(boolean realTrue) {
        isRealTrue = realTrue;
    }
}
