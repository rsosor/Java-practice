package com.macro.demo.designpatterns.abstractfactorypattern.sub;

import com.macro.demo.designpatterns.abstractfactorypattern.AbstractFactory;
import com.macro.demo.designpatterns.abstractfactorypattern.Audi;
import com.macro.demo.designpatterns.abstractfactorypattern.BMW;

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
