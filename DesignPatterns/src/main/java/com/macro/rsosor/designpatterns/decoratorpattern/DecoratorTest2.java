package com.macro.rsosor.designpatterns.decoratorpattern;

import com.macro.rsosor.designpatterns.decoratorpattern.sub.sub.SimpleSet;
import org.junit.Test;

public class DecoratorTest2 {

    @Test
    public void test() {
        SimpleSet simpleSet = new SimpleSet();
        simpleSet.show();
    }
}
