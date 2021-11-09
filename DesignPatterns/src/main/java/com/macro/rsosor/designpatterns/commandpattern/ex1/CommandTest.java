package com.macro.rsosor.designpatterns.commandpattern.ex1;

import com.macro.rsosor.designpatterns.commandpattern.ex1.sub.Brighter;
import com.macro.rsosor.designpatterns.commandpattern.ex1.sub.Darker;
import com.macro.rsosor.designpatterns.commandpattern.ex1.sub.TurnOn;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void test() {
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
