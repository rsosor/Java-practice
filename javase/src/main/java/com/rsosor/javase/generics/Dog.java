package com.rsosor.javase.generics;

public class Dog<T> extends Animal<T> {

    int walkDistancePreference;

    public Dog(String name) {
        super(name);
    }
}
