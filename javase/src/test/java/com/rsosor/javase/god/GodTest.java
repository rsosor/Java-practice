package com.rsosor.javase.god;

import org.junit.jupiter.api.Test;

public class GodTest {

    @Test
    public void god() {
        God god = new God();
        int forIndex = 100000;
        int index = 15000;
        god.god(index);
/*
        for (int i = 0; i <= forIndex; i++) {
            System.out.print(i + ": ");
            god.god(i);
            System.out.println("\n----------------------------------------------");
        }

 */
    }

    @Test
    public void ternary() {
        int a = 10;
        int b = 7;
        int c = 0;

        boolean flag = true;
        c = flag ? a : b;
        System.out.println(c);
        flag = false;
        c = flag ? a : b;
        System.out.println(c);
    }
}
