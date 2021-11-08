package com.macro.demo.designpatterns.visitorpattern;

import com.macro.demo.designpatterns.visitorpattern.sub.AirQuality;
import com.macro.demo.designpatterns.visitorpattern.sub.Temperature;

public interface Visit {

    void visit(AirQuality airQuality);

    void visit(Temperature temperature);
}
