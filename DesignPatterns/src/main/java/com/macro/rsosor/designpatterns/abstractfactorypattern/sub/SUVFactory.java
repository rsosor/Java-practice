package com.macro.rsosor.designpatterns.abstractfactorypattern.sub;

import com.macro.rsosor.designpatterns.abstractfactorypattern.AbstractFactory;
import com.macro.rsosor.designpatterns.abstractfactorypattern.Audi;
import com.macro.rsosor.designpatterns.abstractfactorypattern.BMW;

public class SUVFactory extends AbstractFactory {

    @Override
    protected Audi createAudi() {
        return new AudiSUV();
    }

    @Override
    protected BMW createBMW() {
        return new BMWSUV();
    }
}
