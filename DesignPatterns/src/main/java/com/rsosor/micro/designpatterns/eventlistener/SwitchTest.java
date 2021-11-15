package com.rsosor.micro.designpatterns.eventlistener;

import com.rsosor.micro.designpatterns.eventlistener.impl.TVSwitchListener;
import org.junit.jupiter.api.Test;

public class SwitchTest {

    @Test
    public void test() {
        SwitchManager manager = new SwitchManager();
        manager.addDoorListener(new TVSwitchListener());

        manager.fireSwitchOn();
        manager.fireSwitchOff();

    }

}
