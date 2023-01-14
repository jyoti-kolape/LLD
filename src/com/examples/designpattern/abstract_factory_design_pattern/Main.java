package com.examples.designpattern.abstract_factory_design_pattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactoryOfFactory vehicleFactoryOfFactory = new VehicleFactoryOfFactory();
        VehicleFactory ordinary = vehicleFactoryOfFactory.getVehicleFactory("ORDINARY");
        Vehicle vehicle = ordinary.getVehicle("OrdinaryVehicleOne");
        vehicle.average();
    }
}
