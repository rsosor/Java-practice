package com.rsosor.micro.designpatterns.eventlistener;

import java.util.EventObject;

public class SwitchEvent extends EventObject implements Cloneable {

    private String switchState = "";

    public SwitchEvent(Object source, String switchState) {
        super(source);
        this.switchState = switchState;
    }

    public String getSwitchState() {
        return switchState;
    }

    public void setSwitchState(String switchState) {
        this.switchState = switchState;
    }
}
