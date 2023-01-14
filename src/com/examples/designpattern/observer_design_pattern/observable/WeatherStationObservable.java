package com.examples.designpattern.observer_design_pattern.observable;

import com.examples.designpattern.observer_design_pattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable {

    List<DisplayObserver> objList = new ArrayList<>();
    int currentTemp;

    @Override
    public void add(DisplayObserver displayObserver) {
        objList.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        objList.remove(displayObserver);
    }

    @Override
    public void notifyToSubscriber() {
        for (DisplayObserver displayObserver : objList) {
            displayObserver.update(currentTemp);
        }
    }

    @Override
    public void setData(int newTemp) {
        if(currentTemp != newTemp){
            currentTemp = newTemp;
            notifyToSubscriber();
        }
    }

    @Override
    public int getData() {
        return currentTemp;
    }

}
