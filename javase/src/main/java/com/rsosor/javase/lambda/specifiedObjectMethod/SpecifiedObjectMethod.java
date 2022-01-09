package com.rsosor.javase.lambda.specifiedObjectMethod;

public class SpecifiedObjectMethod {

    // 像 Arrays.sort() 規定得實作 Animal 說明此方法
    public static void good(Animal animal) {
        System.out.println("SpecifiedObjectMethod 是 Arrays.sort(T[] a, Comparator<? super T> c) 之中的 Arrays");
    }
}
