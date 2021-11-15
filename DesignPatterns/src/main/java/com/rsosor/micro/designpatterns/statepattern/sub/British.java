package com.rsosor.micro.designpatterns.statepattern.sub;

import com.rsosor.micro.designpatterns.statepattern.State;

public class British extends State {

    @Override
    public String tempToDisplay(Double temperature) {
        System.out.println("顯示英制");
        return twoDecPlaces(temperature * 9 / 5 + 32);
    }

    @Override
    public String vibToDisplay(Double vibration) {
        System.out.println("顯示公制");
        return twoDecPlaces(vibration * 25.4);
    }

    @Override
    public String tempToSave(Double temperature) {
        System.out.println("儲存公制");
        return saveForm((temperature - 32) * 5 / 9);
    }

    @Override
    public String vibToSave(Double vibration) {
        System.out.println("儲存公制");
        return saveForm(vibration / 25.4);
    }
}
