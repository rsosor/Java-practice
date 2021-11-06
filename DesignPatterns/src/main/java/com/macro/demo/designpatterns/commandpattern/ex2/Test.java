package com.macro.demo.designpatterns.commandpattern.ex2;

import com.macro.demo.designpatterns.commandpattern.ex2.sub.StraightDown;
import com.macro.demo.designpatterns.commandpattern.ex2.sub.TurnLeft;
import com.macro.demo.designpatterns.commandpattern.ex2.sub.TurnRight;

public class Test {

    public static void main(String[] args) {
        Tetris tetris = new Tetris();

        CommandTetris commandLeft = new TurnLeft(tetris);
        CommandTetris commandRight = new TurnRight(tetris);
        CommandTetris commandDown = new StraightDown(tetris);

        Invoker invoker = new Invoker(commandLeft);
        invoker.invoke();

        invoker.setCommand(commandRight);
        invoker.invoke();

        invoker.setCommand(commandDown);
        invoker.invoke();
    }
}
