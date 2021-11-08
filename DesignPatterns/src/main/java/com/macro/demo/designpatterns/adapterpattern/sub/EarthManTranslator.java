package com.macro.demo.designpatterns.adapterpattern.sub;

import com.macro.demo.designpatterns.adapterpattern.People;

public class EarthManTranslator extends People {

    public EarthManTranslator(String name) {
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
