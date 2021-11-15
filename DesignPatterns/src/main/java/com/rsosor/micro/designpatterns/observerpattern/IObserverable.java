package com.rsosor.micro.designpatterns.observerpattern;

public interface IObserverable {

    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers();

    String getName();
}
