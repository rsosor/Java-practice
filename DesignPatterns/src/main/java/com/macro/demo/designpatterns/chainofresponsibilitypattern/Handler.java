package com.macro.demo.designpatterns.chainofresponsibilitypattern;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Trouble trouble);
}
