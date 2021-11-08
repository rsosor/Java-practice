package com.macro.demo.designpatterns.decoratorpattern;

import com.macro.demo.designpatterns.decoratorpattern.sub.sub.SimpleSet;
import org.junit.jupiter.api.Test;

public class DecoratorTest2 {

    @Test
    public void test() {
        SimpleSet simpleSet = new SimpleSet();
        simpleSet.show();
    }
}
