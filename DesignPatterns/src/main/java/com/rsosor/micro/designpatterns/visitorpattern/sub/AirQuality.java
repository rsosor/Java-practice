package com.rsosor.micro.designpatterns.visitorpattern.sub;

import com.rsosor.micro.designpatterns.visitorpattern.Visit;
import com.rsosor.micro.designpatterns.visitorpattern.Weather;

public class AirQuality extends Weather {

    public AirQuality() {
        super();
    }

    public String getAirQGraph() {
        return "空氣品質趨勢圖";
    }

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }
}
