package com.macro.rsosor.designpatterns.mementopattern;

import org.junit.Test;

public class MementoTest {

    @Test
    public void test() {
        ComputerCareTaker careTaker = new ComputerCareTaker();
        ComputerOriginator originator = new ComputerOriginator();

        careTaker.saveMemento(originator.save());
        System.out.println(careTaker.getSave(0).getSystem());

        originator.setSystem("windows");

        careTaker.saveMemento(originator.save());
        System.out.println(careTaker.getSave(1).getSystem());
    }
}
