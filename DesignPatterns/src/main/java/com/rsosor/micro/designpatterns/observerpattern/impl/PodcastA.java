package com.rsosor.micro.designpatterns.observerpattern.impl;

import com.rsosor.micro.designpatterns.observerpattern.IObserver;
import com.rsosor.micro.designpatterns.observerpattern.IObserverable;

import java.util.ArrayList;
import java.util.List;

public class PodcastA implements IObserverable {

    List<IObserver> list = new ArrayList<>();

    public String name = "英文廣播";

    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : list) {
            o.update();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
