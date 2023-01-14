package com.examples.solidprinciple.liskov_substitution_principle;

// It should be able to replace the object of parent with child without breaking the behaviour of the program
public class Main {
    public static void main(String[] args) {
        Bike bike = new Motorcycle();
        bike.turnOnEngine();
        bike.accelerate();

        //this throws error hence breaking the behaviour so this type of limitation should not be there
        Bike biCycle = new BiCycle();
        biCycle.turnOnEngine();
        biCycle.accelerate();
    }


}
