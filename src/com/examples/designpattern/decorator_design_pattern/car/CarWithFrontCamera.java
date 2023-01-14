package com.examples.designpattern.decorator_design_pattern.car;

public class CarWithFrontCamera extends Car{
    @Override
    public void addNewFeature() {
        System.out.println("Font Camera is added in the car");
    }
}
