package com.examples.designpattern.abstract_factory_design_pattern;

public class OrdinaryVehicle implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "OrdinaryVehicleOne":
                return new OrdinaryVehicleOne();
            case "OrdinaryVehicleTwo" :
                return new OrdinaryVehicleTwo();
            default:
                return null;
        }
    }
}
