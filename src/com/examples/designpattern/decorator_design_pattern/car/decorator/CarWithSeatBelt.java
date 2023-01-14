package com.examples.designpattern.decorator_design_pattern.car.decorator;

import com.examples.designpattern.decorator_design_pattern.car.Car;

public class CarWithSeatBelt extends FeatureDecorator{

    Car car;

    public CarWithSeatBelt(Car car) {
        this.car = car;
    }

    @Override
    public void addNewFeature() {
        car.addNewFeature();
        System.out.println("Seat belt added in the car");
    }
}
