package com.rsosor.javase.lambda.defaultmethod;

public interface ISome {

    default void doIt() {
        subMethod1();
        subMethod2();
    }

    /**
     * JDK 9 介面也可以定義 private method，不用加上 default 修飾
     */
    private void subMethod1() {
        System.out.print("Hello, ");
    }

    private void subMethod2() {
        System.out.println("World！");
    }
}
