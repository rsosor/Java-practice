package com.macro.demo.designpatterns.visitorpattern.impl;

import com.macro.demo.designpatterns.visitorpattern.Visit;
import com.macro.demo.designpatterns.visitorpattern.sub.AirQuality;
import com.macro.demo.designpatterns.visitorpattern.sub.Temperature;

public class Man implements Visit {

    @Override
    public void visit(AirQuality airQuality) {
        System.out.println("稍微看一下空氣品質: " + airQuality.airQuality);
    }

    @Override
    public void visit(Temperature temperature) {
        System.out.println("關心一下: " + temperature.getTempGraph());
    }
}