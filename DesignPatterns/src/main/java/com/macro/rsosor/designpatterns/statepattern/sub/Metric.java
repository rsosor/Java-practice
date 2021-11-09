package com.macro.rsosor.designpatterns.statepattern.sub;

import com.macro.rsosor.designpatterns.statepattern.State;

public class Metric extends State {

    @Override
    public String tempToDisplay(Double temperature) {
        System.out.println("顯示公制");
        return twoDecPlaces(temperature);
    }

    @Override
    public String vibToDisplay(Double vibration) {
        System.out.println("顯示公制");
        return twoDecPlaces(vibration);
    }

    @Override
    public String tempToSave(Double temperature) {
        System.out.println("儲存公制");
        return saveForm(temperature);
    }

    @Override
    public String vibToSave(Double vibration) {
        System.out.println("儲存公制");
        return saveForm(vibration);
    }
}
