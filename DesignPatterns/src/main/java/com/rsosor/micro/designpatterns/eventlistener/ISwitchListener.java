package com.rsosor.micro.designpatterns.eventlistener;

import java.util.EventListener;

public interface ISwitchListener extends EventListener {

    void switchEvent(SwitchEvent event);
}
