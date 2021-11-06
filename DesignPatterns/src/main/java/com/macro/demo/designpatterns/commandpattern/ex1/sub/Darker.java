package com.macro.demo.designpatterns.commandpattern.ex1.sub;

import com.macro.demo.designpatterns.commandpattern.ex1.Command;
import com.macro.demo.designpatterns.commandpattern.ex1.Light;

public class Darker extends Command {

    public Darker(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.darker();
    }
}
