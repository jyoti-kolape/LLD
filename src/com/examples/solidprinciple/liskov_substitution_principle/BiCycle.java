package com.examples.solidprinciple.liskov_substitution_principle;

public class BiCycle implements Bike{
    int speed;
    @Override
    public void turnOnEngine() {
        throw new AssertionError("BiCycle does not have engine");
    }

    @Override
    public void accelerate() {
        speed = speed+2;
    }
}
