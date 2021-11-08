package com.macro.demo.designpatterns.adapterpattern;

import com.macro.demo.designpatterns.adapterpattern.sub.EarthManTranslator;

public class Test {

    public static void main(String[] args) {
        EarthMan earthMan = new EarthMan("black");

        earthMan.hello();
        earthMan.selfIntro();

        Client taiwanMan = new Client(new EarthManTranslator("孫悟空"));

        taiwanMan.hello();
        taiwanMan.selfIntro();
    }
}
