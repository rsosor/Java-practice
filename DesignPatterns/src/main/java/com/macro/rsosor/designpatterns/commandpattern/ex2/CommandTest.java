package com.macro.rsosor.designpatterns.commandpattern.ex2;

import com.macro.rsosor.designpatterns.commandpattern.ex2.sub.StraightDown;
import com.macro.rsosor.designpatterns.commandpattern.ex2.sub.TurnLeft;
import com.macro.rsosor.designpatterns.commandpattern.ex2.sub.TurnRight;
import org.junit.Test;

public class CommandTest {

    @Test
    public void test() {
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
