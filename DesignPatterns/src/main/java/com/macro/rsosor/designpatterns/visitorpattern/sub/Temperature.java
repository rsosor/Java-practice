package com.macro.rsosor.designpatterns.visitorpattern.sub;

import com.macro.rsosor.designpatterns.visitorpattern.Visit;
import com.macro.rsosor.designpatterns.visitorpattern.Weather;

public class Temperature extends Weather {

    public Temperature() {
        super();
    }

    public String getTempGraph() {
        return "溫度趨勢圖";
    }

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }
}
