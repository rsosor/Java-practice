package com.rsosor.micro.designpatterns.commandpattern.ex2.sub;

import com.rsosor.micro.designpatterns.commandpattern.ex2.CommandTetris;
import com.rsosor.micro.designpatterns.commandpattern.ex2.Tetris;

public class TurnLeft extends CommandTetris {

    public TurnLeft(Tetris tetris) {
        super(tetris);
    }

    @Override
    public void execute() {
        tetris.turnLeft();
    }
}
