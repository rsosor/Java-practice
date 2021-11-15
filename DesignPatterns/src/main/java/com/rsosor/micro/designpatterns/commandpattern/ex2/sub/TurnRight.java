package com.rsosor.micro.designpatterns.commandpattern.ex2.sub;

import com.rsosor.micro.designpatterns.commandpattern.ex2.CommandTetris;
import com.rsosor.micro.designpatterns.commandpattern.ex2.Tetris;

public class TurnRight extends CommandTetris {

    public TurnRight(Tetris tetris) {
        super(tetris);
    }

    @Override
    public void execute() {
        tetris.turnRight();
    }
}
