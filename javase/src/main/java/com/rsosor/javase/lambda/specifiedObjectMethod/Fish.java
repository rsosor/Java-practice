package com.rsosor.javase.lambda.specifiedObjectMethod;

public class Fish {

    // String 的 compareTo(String s2);
    // 可以使用方法參考來實作 Animal 的 void run(Fish fish, String s2)
    void swim(String anotherString) {
        System.out.println("使用 fish.swim(" + anotherString + ");");
    }
}
