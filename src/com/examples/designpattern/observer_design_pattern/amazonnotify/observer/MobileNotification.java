package com.examples.designpattern.observer_design_pattern.amazonnotify.observer;

import com.examples.designpattern.observer_design_pattern.amazonnotify.observable.StockObservable;
import com.examples.designpattern.observer_design_pattern.observable.Observable;

public class MobileNotification implements Observer{

    StockObservable observable;
    String mobile;

    public MobileNotification(StockObservable observable, String mobile) {
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        sendMsgOnMobile();
    }

    private void sendMsgOnMobile(){
        System.out.println("msg sent on "+ mobile);
    }
}
