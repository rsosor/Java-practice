package com.macro.rsosor.designpatterns.eventlistener;

import java.util.EventListener;

public interface ISwitchListener extends EventListener {

    void switchEvent(SwitchEvent event);
}
