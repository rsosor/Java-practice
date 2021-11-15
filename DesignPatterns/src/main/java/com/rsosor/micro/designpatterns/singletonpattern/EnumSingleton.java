package com.rsosor.micro.designpatterns.singletonpattern;

public enum EnumSingleton {

    /**
     * 能避免反序列化
     */
    INSTANCE;

    public void doSomething() {
        System.out.println("do do !");
    }
}
