package com.examples.designpattern.strategy_design_pattern;

public class Vehicle {

    StrategyDesignInterface strategyDesignInterface;

    public Vehicle(StrategyDesignInterface strategyDesignInterface){
        this.strategyDesignInterface = strategyDesignInterface;
    }

    public void drive(){
        strategyDesignInterface.drive();
    }
}
