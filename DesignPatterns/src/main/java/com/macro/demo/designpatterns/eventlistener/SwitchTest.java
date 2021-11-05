package com.macro.demo.designpatterns.eventlistener;

import com.macro.demo.designpatterns.eventlistener.impl.TVSwitchListener;

public class SwitchTest {

    public static void main(String[] args) {
        SwitchManager manager = new SwitchManager();
        manager.addDoorListener(new TVSwitchListener());

        manager.fireSwitchOn();
        manager.fireSwitchOff();

    }

}
