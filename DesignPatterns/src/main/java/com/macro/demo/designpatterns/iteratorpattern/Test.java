package com.macro.demo.designpatterns.iteratorpattern;

import com.macro.demo.designpatterns.iteratorpattern.impl.CompanyA;

public class Test {

    public static void main(String[] args) {
        CompanyA companyA = new CompanyA();

        Iterator iterator = companyA.createIterator();

        while (!iterator.isDone()) {
            System.out.println( ((Employee)iterator.currentItem()).name + ": " +
                    ((Employee)iterator.currentItem()).title + " 發薪水囉");
            iterator.next();
        }
    }
}
