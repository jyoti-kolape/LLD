package com.examples.designpattern.observer_design_pattern.observable;

import com.examples.designpattern.observer_design_pattern.observer.DisplayObserver;

public interface Observable {
     void add(DisplayObserver displayObserver);
     void remove(DisplayObserver displayObserver);
     void notifyToSubscriber();
     void setData(int newData);
     int getData();
}
