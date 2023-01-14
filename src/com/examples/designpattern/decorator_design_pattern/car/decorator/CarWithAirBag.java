package com.examples.designpattern.decorator_design_pattern.car.decorator;

import com.examples.designpattern.decorator_design_pattern.car.Car;

public class CarWithAirBag extends FeatureDecorator{

    Car car;

    public CarWithAirBag(Car car) {
        this.car = car;
    }

    @Override
    public void addNewFeature() {
        car.addNewFeature();
        System.out.println("Air bag added in the car");
    }
}
