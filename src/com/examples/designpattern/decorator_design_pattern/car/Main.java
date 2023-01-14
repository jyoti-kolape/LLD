package com.examples.designpattern.decorator_design_pattern.car;

import com.examples.designpattern.decorator_design_pattern.car.decorator.CarWithAirBag;
import com.examples.designpattern.decorator_design_pattern.car.decorator.CarWithSeatBelt;

public class Main {
    public static void main(String[] args) {
        Car car = new CarWithSeatBelt(new CarWithAirBag(new CarWithFrontCamera()));
        car.addNewFeature();
    }
}
