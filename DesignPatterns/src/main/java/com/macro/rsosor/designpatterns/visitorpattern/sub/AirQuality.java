package com.macro.rsosor.designpatterns.visitorpattern.sub;

import com.macro.rsosor.designpatterns.visitorpattern.Visit;
import com.macro.rsosor.designpatterns.visitorpattern.Weather;

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
