package com.macro.demo.designpatterns.mementopattern;

public class Test {

    public static void main(String[] args) {
        ComputerCareTaker careTaker = new ComputerCareTaker();
        ComputerOriginator originator = new ComputerOriginator();

        careTaker.saveMemento(originator.save());
        System.out.println(careTaker.getSave(0).getSystem());

        originator.setSystem("windows");

        careTaker.saveMemento(originator.save());
        System.out.println(careTaker.getSave(1).getSystem());
    }
}
