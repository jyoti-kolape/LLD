package com.examples.designpattern.observer_design_pattern.amazonnotify;

import com.examples.designpattern.observer_design_pattern.amazonnotify.observable.IPhoneObservable;
import com.examples.designpattern.observer_design_pattern.amazonnotify.observable.StockObservable;
import com.examples.designpattern.observer_design_pattern.amazonnotify.observer.EmailNotification;
import com.examples.designpattern.observer_design_pattern.amazonnotify.observer.MobileNotification;
import com.examples.designpattern.observer_design_pattern.amazonnotify.observer.Observer;

public class Store {
    public static void main(String[] args) {
        StockObservable iPhone = new IPhoneObservable();

        Observer observer1 = new MobileNotification(iPhone, "09876543212");
        Observer observer2 = new EmailNotification(iPhone, "jyotik@gmail.com");
        Observer observer3 = new MobileNotification(iPhone, "4544567567777");

        iPhone.add(observer1);
        iPhone.add(observer2);
        iPhone.add(observer3);

        iPhone.setData(10);
    }
}
