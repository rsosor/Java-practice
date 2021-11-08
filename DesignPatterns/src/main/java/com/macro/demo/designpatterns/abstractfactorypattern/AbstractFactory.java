package com.macro.demo.designpatterns.abstractfactorypattern;

public abstract class AbstractFactory {

    protected abstract Audi createAudi();

    protected abstract BMW createBMW();
}
