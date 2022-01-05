package com.rsosor.javase.lambda;

/**
 * @FunctionalInterface 就是介面，但要求僅具單一抽象方法
 * 許多既有的介面都是這類介面，像標準 API 的 Runnable、Callable、Comparator 等
 *
 * @author RsosoR
 * @date 2022/1/5
 */
@FunctionalInterface
public interface Calculator<T> extends SuperCalculator<T> {

    T cal(T o1, T o2);

    @Override
    default void sum(int a, int b) {
        System.out.println(a + b + 300);
    }
}
