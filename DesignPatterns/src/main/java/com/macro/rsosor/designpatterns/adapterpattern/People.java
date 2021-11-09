package com.macro.rsosor.designpatterns.adapterpattern;

public abstract class People {

    String name;

    public People(String name) {
        this.name = name;
    }

    public abstract void hello();

    public abstract void selfIntro();

    public String getName() {
        return name;
    }
}
