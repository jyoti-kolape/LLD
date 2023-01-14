package com.examples.designpattern.decorator_design_pattern.car;

public class CarWithDisplayBoard extends Car{
    @Override
    public void addNewFeature() {
        System.out.println("Display board is added in the Car");
    }
}
