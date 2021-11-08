package com.macro.demo.designpatterns.mediatorpattern;

public interface Company {

    void addMember(CoWorker coWorker);

    void introduce(CoWorker coWorker);

    void workHard();

    void giveWork(CoWorker coWorker);
}
