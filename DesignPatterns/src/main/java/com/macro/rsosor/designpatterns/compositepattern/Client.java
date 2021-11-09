package com.macro.rsosor.designpatterns.compositepattern;

import com.macro.rsosor.designpatterns.compositepattern.sub.Composite;
import com.macro.rsosor.designpatterns.compositepattern.sub.Leaf;
import org.junit.jupiter.api.Test;

public class Client {

    @Test
    public void test() {
        Component big = new Composite("大公司");

        Component mid = new Composite("子公司");
        Component mid2 = new Composite("子公司2");

        Component small = new Leaf("部門");
        Component small2 = new Leaf("部門2");
        Component small3 = new Leaf("部門3");
        Component small4 = new Leaf("部門4");

        big.add(mid);
        big.add(mid2);

        mid.add(small);
        mid.add(small2);

        mid2.add(small3);
        mid2.add(small4);

        Component small5 = new Leaf("部門5");

        small.add(small5);

        System.out.println("-------- 大公司 --------");

        big.display(1);
        big.command("開發快一點");

        System.out.println("-------- 子公司 --------");
        mid2.display(1);
        mid2.command("大老闆說下個月要完成");
    }
}
