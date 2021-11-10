package com.macro.rsosor.designpatterns.eventlistener;

import com.macro.rsosor.designpatterns.eventlistener.impl.TVSwitchListener;
import org.junit.Test;

public class SwitchTest {

    @Test
    public void test() {
        SwitchManager manager = new SwitchManager();
        manager.addDoorListener(new TVSwitchListener());

        manager.fireSwitchOn();
        manager.fireSwitchOff();

    }

}
