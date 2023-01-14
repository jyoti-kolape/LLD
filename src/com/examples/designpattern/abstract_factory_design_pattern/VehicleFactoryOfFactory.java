package com.examples.designpattern.abstract_factory_design_pattern;

public class VehicleFactoryOfFactory {

    VehicleFactory getVehicleFactory(String input){

        switch (input){
            case "ORDINARY" :
                return new OrdinaryVehicle();
            case "LUXURY" :
                return new LuxuryVehicle();
            default:
                return null;
        }

    }
}
