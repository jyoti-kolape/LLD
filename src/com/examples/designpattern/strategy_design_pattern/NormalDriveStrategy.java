package com.examples.designpattern.strategy_design_pattern;

public class NormalDriveStrategy implements StrategyDesignInterface{
    @Override
    public void drive() {
        System.out.println("need NormalDriveStrategy");
    }
}
