package com.examples.designpattern.observer_design_pattern.observable;

import com.examples.designpattern.observer_design_pattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreObservable implements Observable {

    List<DisplayObserver> objList = new ArrayList<>();
    int currentScore = 0;

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
            displayObserver.update(currentScore);
        }
    }

    @Override
    public void setData(int newScore) {
        if (currentScore != newScore) {
            currentScore = newScore;
            notifyToSubscriber();
        }
    }

    @Override
    public int getData() {
        return currentScore;
    }
}
