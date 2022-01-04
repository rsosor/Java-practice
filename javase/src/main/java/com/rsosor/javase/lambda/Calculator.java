package com.rsosor.javase.lambda;

@FunctionalInterface
public interface Calculator<T> {

    T calculator(T o1, T o2);

    default void sum(int a, int b) {
        System.out.println(a + b);
    }

}
