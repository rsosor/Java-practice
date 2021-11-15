package com.rsosor.micro.designpatterns.visitorpattern.impl;

import com.rsosor.micro.designpatterns.visitorpattern.Visit;
import com.rsosor.micro.designpatterns.visitorpattern.sub.AirQuality;
import com.rsosor.micro.designpatterns.visitorpattern.sub.Temperature;

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
