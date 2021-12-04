package com.rsosor.practice.demo;

import org.junit.*;

public class SecondTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

    @Test
    public void Case1() {
        System.out.println("test case 1");
    }

    @Test
    public void Case2() {
        System.out.println("test case 2");
    }
}
