package com.examples.designpattern.strategy_design_pattern;

public class SportsDriveStrategy implements StrategyDesignInterface{
    @Override
    public void drive() {
        System.out.println("need SportsDriveStrategy");
    }
}
