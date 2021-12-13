package com.rsosor.practice.demo;

import com.rsosor.practice.utils.TestPrinter;
import org.junit.Rule;
import org.junit.Test;

public class MyLoggerTest {

    @Rule
    public final TestPrinter printer = new TestPrinter();

    @Test
    public void testCase1() {
        System.out.println("test case 111");
    }

    @Test
    public void testCase2() {
        System.out.println("test case 222");
    }

}
