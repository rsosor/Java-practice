package com.rsosor.micro.designpatterns.commandpattern.ex1.sub;

import com.rsosor.micro.designpatterns.commandpattern.ex1.Command;
import com.rsosor.micro.designpatterns.commandpattern.ex1.Light;

public class TurnOff extends Command {

    public TurnOff(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
