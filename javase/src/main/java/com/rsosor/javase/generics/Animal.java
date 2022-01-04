package com.rsosor.javase.generics;

import java.util.List;

public class Animal<T> {

    public String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    void walkAll(List<? extends Animal> myList) {
        for (Animal animal : myList) {
            System.out.println(animal.name + " is walking");
        }
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }
}
