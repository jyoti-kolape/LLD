package com.examples.designpattern.observer_design_pattern.amazonnotify.observable;

import com.examples.designpattern.observer_design_pattern.amazonnotify.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class TVObservable implements StockObservable {

    List<Observer> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyToSubscriber() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        if (stockCount != data) {
            stockCount = stockCount + data;
            notifyToSubscriber();
        }
    }
}
