package com.examples.designpattern.observer_design_pattern.amazonnotify.observable;

import com.examples.designpattern.observer_design_pattern.amazonnotify.observer.Observer;

public interface StockObservable {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyToSubscriber();
    void setData(int data);
}
