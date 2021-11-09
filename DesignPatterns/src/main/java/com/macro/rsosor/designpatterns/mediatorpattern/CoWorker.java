package com.macro.rsosor.designpatterns.mediatorpattern;

import com.macro.rsosor.designpatterns.mediatorpattern.impl.Boss;

public abstract class CoWorker {

    public String name;

    public Boss boss;

    public CoWorker(String name) {
        this.name = name;
    }

    public abstract void work();
}
