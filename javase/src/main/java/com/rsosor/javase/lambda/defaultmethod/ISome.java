package com.rsosor.javase.lambda.defaultmethod;

public interface ISome {

    default void doIt() {
        subMethod1();
        subMethod2();
    }

    /**
     * JDK 8 除了讓介面可以定義預設方法，也允許定義靜態方法
     * nullFirst()、reverseOrder() 等方法，就是定義在 Comparator
     *
     * 介面的公開靜態方法，演算流程可能被拆解為數個小流程，定義於其他靜態方法中，若這些方法不用公開給外界
     * 從 JDK 9 可以定義為 private static method
     */


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
