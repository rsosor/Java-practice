package com.macro.rsosor.designpatterns.observerpattern.impl;

import com.macro.rsosor.designpatterns.observerpattern.IObserver;
import com.macro.rsosor.designpatterns.observerpattern.IObserverable;

public class Student implements IObserver {

    IObserverable observerable;

    public Student(IObserverable observerable) {
        this.observerable = observerable;
    }

    @Override
    public void update() {
        System.out.println("聽了" + observerable.getName());
    }
}
