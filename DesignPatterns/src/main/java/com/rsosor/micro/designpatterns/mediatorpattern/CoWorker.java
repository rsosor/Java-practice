package com.rsosor.micro.designpatterns.mediatorpattern;

import com.rsosor.micro.designpatterns.mediatorpattern.impl.Boss;

public abstract class CoWorker {

    public String name;

    public Boss boss;

    public CoWorker(String name) {
        this.name = name;
    }

    public abstract void work();
}
