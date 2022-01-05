package com.rsosor.javase.lambda.specifiedObjectMethod;

public class Main {

    public static void main(String[] args) {
        SpecifiedObjectMethod.good(Fish::swim);
        SpecifiedObjectMethod.good((Fish fish, String s2) -> fish.swim(s2));
        // good(Animal animal) 要參數 Animal 但傳入 方法參考 Fish::swim 也可以
        // 由 Fish 的 swim(String anotherString) 取代 Animal 的 run(Fish fish, String s2)
        // 抽象自 String 的 compareTo(String anotherString) 取代 Comparator 的 compare(T o1, T o2)
    }
}
