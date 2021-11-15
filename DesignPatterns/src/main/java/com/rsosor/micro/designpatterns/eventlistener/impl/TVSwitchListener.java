package com.rsosor.micro.designpatterns.eventlistener.impl;

import com.rsosor.micro.designpatterns.eventlistener.ISwitchListener;
import com.rsosor.micro.designpatterns.eventlistener.SwitchEvent;

public class TVSwitchListener implements ISwitchListener {

    @Override
    public void switchEvent(SwitchEvent event) {
        if (event.getSwitchState() != null && event.getSwitchState().equals("open")) {
            System.out.println("open TV");
        } else {
            System.out.println("close TV");
        }
    }
}
