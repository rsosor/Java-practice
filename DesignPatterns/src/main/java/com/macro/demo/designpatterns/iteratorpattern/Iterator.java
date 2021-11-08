package com.macro.demo.designpatterns.iteratorpattern;

public interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object currentItem();
}
