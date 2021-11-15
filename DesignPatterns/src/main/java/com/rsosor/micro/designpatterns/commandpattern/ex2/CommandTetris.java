package com.rsosor.micro.designpatterns.commandpattern.ex2;

public abstract class CommandTetris {

    protected Tetris tetris;

    public CommandTetris(Tetris tetris) {
        this.tetris = tetris;
    }
    public abstract void execute();
}
