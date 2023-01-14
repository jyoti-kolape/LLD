package com.examples.designpattern.observer_design_pattern.amazonnotify.observer;

import com.examples.designpattern.observer_design_pattern.amazonnotify.observable.StockObservable;

public class EmailNotification implements Observer {
    StockObservable observable;
    String emailId;

    public EmailNotification(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail();
    }

    private void sendMail() {
        System.out.println("mail sent on " + emailId);
    }
}
