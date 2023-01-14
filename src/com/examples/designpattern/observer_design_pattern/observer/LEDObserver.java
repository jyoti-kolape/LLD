package com.examples.designpattern.observer_design_pattern.observer;

import com.examples.designpattern.observer_design_pattern.observable.Observable;

public class LEDObserver implements DisplayObserver{

    Observable observable;

    public LEDObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(int data) {
        System.out.println(data +" is updated on LED display");
    }
}
