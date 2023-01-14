package com.examples.solidprinciple.liskov_substitution_principle;

public class Motorcycle implements Bike {
    boolean isEngineTurnOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineTurnOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
