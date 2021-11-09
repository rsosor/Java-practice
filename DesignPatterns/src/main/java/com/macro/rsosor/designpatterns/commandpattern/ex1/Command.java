package com.macro.rsosor.designpatterns.commandpattern.ex1;

public abstract class Command {

    public Light light;

    public Command(Light light) {
        this.light = light;
    }

    public abstract void execute();
}
