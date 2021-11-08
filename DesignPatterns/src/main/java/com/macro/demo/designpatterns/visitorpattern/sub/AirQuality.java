package com.macro.demo.designpatterns.visitorpattern.sub;

import com.macro.demo.designpatterns.visitorpattern.Visit;
import com.macro.demo.designpatterns.visitorpattern.Weather;

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
