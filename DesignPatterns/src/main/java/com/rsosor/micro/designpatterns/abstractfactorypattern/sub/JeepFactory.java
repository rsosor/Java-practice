package com.rsosor.micro.designpatterns.abstractfactorypattern.sub;

import com.rsosor.micro.designpatterns.abstractfactorypattern.AbstractFactory;
import com.rsosor.micro.designpatterns.abstractfactorypattern.Audi;
import com.rsosor.micro.designpatterns.abstractfactorypattern.BMW;

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
