package com.rsosor.javase.lambda.specifiedObjectMethod;

public interface Animal {

    // Comparator 的 compare(T o1, T o2);
    // 除了以類別實現，還能透過 匿名類別 || Lambda || Method reference || Constructor reference
    void run(Fish fish, String s2);
}
