package com.rsosor.javase.lambda;

@FunctionalInterface
public interface SuperCalculator<T> {

    T cal(T o1, T o2);

    default void sum(int a, int b) {
        System.out.println(a + b);
    }
}
