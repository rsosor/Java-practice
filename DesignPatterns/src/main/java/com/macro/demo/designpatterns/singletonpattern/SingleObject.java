package com.macro.demo.designpatterns.singletonpattern;

public class SingleObject {

    private static final SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    // 如果該對象被用於序列化，可以保證對象在序列化前後保持一致
    private Object readResolve() {
        return instance;
    }
}
