package com.examples.designpattern.observer_design_pattern;

import com.examples.designpattern.observer_design_pattern.observable.CricketScoreObservable;
import com.examples.designpattern.observer_design_pattern.observable.Observable;
import com.examples.designpattern.observer_design_pattern.observable.WeatherStationObservable;
import com.examples.designpattern.observer_design_pattern.observer.DisplayObserver;
import com.examples.designpattern.observer_design_pattern.observer.LEDObserver;
import com.examples.designpattern.observer_design_pattern.observer.MobileDisplayObserver;
import com.examples.designpattern.observer_design_pattern.observer.TVDisplayObserver;

public class Station {
    public static void main(String[] args) {
        Observable cricketScoreObservable = new CricketScoreObservable();

        DisplayObserver observer1 = new LEDObserver(cricketScoreObservable);
        DisplayObserver observer2 = new TVDisplayObserver(cricketScoreObservable);
        DisplayObserver observer3 = new MobileDisplayObserver(cricketScoreObservable);
        cricketScoreObservable.add(observer1);
        cricketScoreObservable.add(observer2);
        cricketScoreObservable.add(observer3);
        cricketScoreObservable.setData(189);
        System.out.println("**********************************************************");
        Observable weatherStationObservable = new WeatherStationObservable();
        DisplayObserver observer4 = new LEDObserver(weatherStationObservable);
        DisplayObserver observer5 = new TVDisplayObserver(weatherStationObservable);
        DisplayObserver observer6 = new MobileDisplayObserver(weatherStationObservable);

        weatherStationObservable.add(observer4);
        weatherStationObservable.add(observer5);
        weatherStationObservable.add(observer6);

        weatherStationObservable.setData(45);
    }
}
