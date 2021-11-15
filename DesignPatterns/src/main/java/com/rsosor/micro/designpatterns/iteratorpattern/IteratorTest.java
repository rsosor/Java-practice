package com.rsosor.micro.designpatterns.iteratorpattern;

import com.rsosor.micro.designpatterns.iteratorpattern.impl.CompanyA;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void test() {
        CompanyA companyA = new CompanyA();

        Iterator iterator = companyA.createIterator();

        while (!iterator.isDone()) {
            System.out.println( ((Employee)iterator.currentItem()).name + ": " +
                    ((Employee)iterator.currentItem()).title + " 發薪水囉");
            iterator.next();
        }
    }
}
