package com.macro.rsosor.designpatterns.visitorpattern;

public abstract class Weather {

    public double temperature;

    public double airQuality;

    public Weather() {
        temperature = Math.random() * 30;
        airQuality = Math.random() * 300;
    }

    public abstract void accept(Visit visit);
}
