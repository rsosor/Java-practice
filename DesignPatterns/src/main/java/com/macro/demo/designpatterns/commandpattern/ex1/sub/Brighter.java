package com.macro.demo.designpatterns.commandpattern.ex1.sub;

import com.macro.demo.designpatterns.commandpattern.ex1.Command;
import com.macro.demo.designpatterns.commandpattern.ex1.Light;

public class Brighter extends Command {

    public Brighter(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        light.brighter();
    }
}
