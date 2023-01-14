package com.examples.designpattern.abstract_factory_design_pattern;

public class LuxuryVehicle implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String input) {
        switch (input){
            case "LuxuryVehicleOne":
                return new LuxuryVehicleOne();
            case "LuxuryVehicleTwo" :
                return new LuxuryVehicleTwo();
            default:
                return null;
        }

    }
}
