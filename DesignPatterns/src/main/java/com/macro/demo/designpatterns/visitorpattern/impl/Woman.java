package com.macro.demo.designpatterns.visitorpattern.impl;

import com.macro.demo.designpatterns.visitorpattern.Visit;
import com.macro.demo.designpatterns.visitorpattern.sub.AirQuality;
import com.macro.demo.designpatterns.visitorpattern.sub.Temperature;

public class Woman implements Visit {

    @Override
    public void visit(AirQuality airQuality) {
        System.out.println("關心一下: " + airQuality.getAirQGraph());
    }

    @Override
    public void visit(Temperature temperature) {
        System.out.println("稍微看一下溫度: " + temperature.temperature);
    }
}
