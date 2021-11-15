package com.rsosor.micro.designpatterns.commandpattern.ex2;

public class Invoker {

    CommandTetris command;

    public Invoker(CommandTetris command) {
        this.command = command;
    }

    public void setCommand(CommandTetris command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
