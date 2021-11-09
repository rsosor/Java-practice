package com.macro.rsosor.designpatterns.mediatorpattern;

public interface Company {

    void addMember(CoWorker coWorker);

    void introduce(CoWorker coWorker);

    void workHard();

    void giveWork(CoWorker coWorker);
}
