package com.macro.rsosor.designpatterns.visitorpattern;

import com.macro.rsosor.designpatterns.visitorpattern.sub.AirQuality;
import com.macro.rsosor.designpatterns.visitorpattern.sub.Temperature;

public interface Visit {

    void visit(AirQuality airQuality);

    void visit(Temperature temperature);
}
