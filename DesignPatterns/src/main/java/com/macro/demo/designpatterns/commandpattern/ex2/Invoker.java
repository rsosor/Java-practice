package com.macro.demo.designpatterns.commandpattern.ex2;

import com.macro.demo.designpatterns.commandpattern.ex1.Command;

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
