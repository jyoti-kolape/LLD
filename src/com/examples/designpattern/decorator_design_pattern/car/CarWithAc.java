package com.examples.designpattern.decorator_design_pattern.car;

public class CarWithAc extends Car{

    @Override
    public void addNewFeature() {
        System.out.println("Ac is added in the car");
    }
}
