package com.macro.demo.designpatterns.singletonpattern.singletonfactory;

public abstract class Product {

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
