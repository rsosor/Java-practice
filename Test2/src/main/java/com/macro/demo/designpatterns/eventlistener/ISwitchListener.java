package com.macro.demo.designpatterns.eventlistener;

import java.util.EventListener;

public interface ISwitchListener extends EventListener {

    void switchEvent(SwitchEvent event);
}
