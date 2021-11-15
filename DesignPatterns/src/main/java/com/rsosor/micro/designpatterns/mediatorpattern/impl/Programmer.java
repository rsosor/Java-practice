package com.rsosor.micro.designpatterns.mediatorpattern.impl;

import com.rsosor.micro.designpatterns.mediatorpattern.CoWorker;

public class Programmer extends CoWorker {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + "寫程式");
    }
}
