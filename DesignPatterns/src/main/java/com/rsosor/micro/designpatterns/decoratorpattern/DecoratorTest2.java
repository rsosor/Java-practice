package com.rsosor.micro.designpatterns.decoratorpattern;

import com.rsosor.micro.designpatterns.decoratorpattern.sub.sub.SimpleSet;
import org.junit.jupiter.api.Test;

public class DecoratorTest2 {

    @Test
    public void test() {
        SimpleSet simpleSet = new SimpleSet();
        simpleSet.show();
    }
}
