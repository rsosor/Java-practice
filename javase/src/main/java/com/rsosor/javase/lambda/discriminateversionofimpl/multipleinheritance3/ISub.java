package com.rsosor.javase.lambda.discriminateversionofimpl.multipleinheritance3;

public interface ISub {

    default void Foo() {
        System.out.println("ISub 的預設方法 Foo()");
    }
}
