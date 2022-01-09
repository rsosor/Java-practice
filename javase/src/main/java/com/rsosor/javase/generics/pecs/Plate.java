package com.rsosor.javase.generics.pecs;

public class Plate<T> {

    private T item;

    public Plate(T t) {
        item = t;
    }

    public T get() {
        return item;
    }

    public void set(T t) {
        this.item = t;
    }
}
