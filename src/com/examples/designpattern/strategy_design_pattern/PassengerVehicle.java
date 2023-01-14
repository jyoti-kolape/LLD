package com.examples.designpattern.strategy_design_pattern;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
