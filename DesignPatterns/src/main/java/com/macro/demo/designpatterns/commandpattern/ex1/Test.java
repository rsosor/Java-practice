package com.macro.demo.designpatterns.commandpattern.ex1;

import com.macro.demo.designpatterns.commandpattern.ex1.sub.Brighter;
import com.macro.demo.designpatterns.commandpattern.ex1.sub.Darker;
import com.macro.demo.designpatterns.commandpattern.ex1.sub.TurnOn;

public class Test {

    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOn(light);
        Command brighter = new Brighter(light);
        Command darker = new Darker(light);

        Invoker invoker = new Invoker();

        invoker.addCommand(turnOn);
        invoker.addCommand(brighter);
        invoker.addCommand(brighter);
        invoker.addCommand(brighter);
        invoker.addCommand(darker);

        invoker.execute();
    }
}
