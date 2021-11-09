package com.macro.rsosor.designpatterns.adapterpattern.sub;

import com.macro.rsosor.designpatterns.adapterpattern.People;

public class ManTranslator extends People {

    public ManTranslator(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("你好呀");
    }

    @Override
    public void selfIntro() {
        System.out.println("我是超級賽亞人" + getName());
    }
}
