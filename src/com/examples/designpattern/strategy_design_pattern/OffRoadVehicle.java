package com.examples.designpattern.strategy_design_pattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new OffRoadDriveStrategy());
    }
}
