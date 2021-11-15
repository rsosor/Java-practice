package com.rsosor.micro.designpatterns.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class ComputerCareTaker {

    private static final int MAX = 15;

    public List<ComputerMemento> saves = new ArrayList<>();

    public ComputerMemento getSave(int index) {
        if (index > saves.size() -1) {
            index = saves.size() -1;
        }
        return saves.get(index);
    }

    public void saveMemento(ComputerMemento memento) {
        if (saves.size() > MAX) {
            saves.remove(0);
        }
        saves.add(memento);
    }
}
