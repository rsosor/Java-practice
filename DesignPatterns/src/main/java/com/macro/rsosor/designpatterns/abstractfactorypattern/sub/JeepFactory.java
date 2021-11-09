package com.macro.rsosor.designpatterns.abstractfactorypattern.sub;

import com.macro.rsosor.designpatterns.abstractfactorypattern.AbstractFactory;
import com.macro.rsosor.designpatterns.abstractfactorypattern.Audi;
import com.macro.rsosor.designpatterns.abstractfactorypattern.BMW;

public class JeepFactory extends AbstractFactory {

    @Override
    protected Audi createAudi() {
        return new AudiJeep();
    }

    @Override
    protected BMW createBMW() {
        return new BMWJeep();
    }
}
