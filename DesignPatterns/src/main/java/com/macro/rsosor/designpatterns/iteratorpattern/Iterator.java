package com.macro.rsosor.designpatterns.iteratorpattern;

public interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object currentItem();
}
