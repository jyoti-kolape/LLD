package com.examples.designpattern.observer_design_pattern.observer;


import com.examples.designpattern.observer_design_pattern.observable.Observable;

public class TVDisplayObserver implements DisplayObserver {

    Observable observable;

    public TVDisplayObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(int data) {
        System.out.println(data+" is updated on tv display");
    }
}
