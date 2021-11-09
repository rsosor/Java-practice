package com.macro.rsosor.designpatterns.singletonpattern;

public class StaticInnerClass {

    private StaticInnerClass() {}

    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.instance;
    }

    /**
     * 靜態的內部類別
     */
    private static class StaticInnerClassHolder {
        private static StaticInnerClass instance = new StaticInnerClass();
    }
}
