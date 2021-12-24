package com.rsosor.javase.statement;

import org.junit.Test;

public class For {

    @Test
    public void case1() {
        for (int i = 0; i < 10; i++) {      // 外部塊不能讀取內部塊變量 j，像是 JavaScript 的 let；而 JavaScript 的 var 就可以。
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                System.out.print(i);
                System.out.println(j);
            }
            System.out.print(i);
        }
    }
}
