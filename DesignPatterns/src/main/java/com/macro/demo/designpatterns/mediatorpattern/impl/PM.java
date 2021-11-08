package com.macro.demo.designpatterns.mediatorpattern.impl;

import com.macro.demo.designpatterns.mediatorpattern.CoWorker;

public class PM extends CoWorker {

    public PM(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.name + "做 PM 工作");
    }

    public void bossHelp(CoWorker coWorker) {
        this.boss.giveWork(coWorker);
    }
}
