package com.macro.rsosor.designpatterns.adapterpattern;

import com.macro.rsosor.designpatterns.adapterpattern.sub.ManTranslator;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void test() {
        Man man = new Man("black");

        man.hello();
        man.selfIntro();

        EarthMan taiwanMan = new EarthMan(new ManTranslator("孫悟空"));

        taiwanMan.hello();
        taiwanMan.selfIntro();
    }
}
