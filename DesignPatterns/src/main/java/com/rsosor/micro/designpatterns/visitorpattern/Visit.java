package com.rsosor.micro.designpatterns.visitorpattern;

import com.rsosor.micro.designpatterns.visitorpattern.sub.AirQuality;
import com.rsosor.micro.designpatterns.visitorpattern.sub.Temperature;

public interface Visit {

    void visit(AirQuality airQuality);

    void visit(Temperature temperature);
}
