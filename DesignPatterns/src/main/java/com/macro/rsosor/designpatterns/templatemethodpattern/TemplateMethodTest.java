package com.macro.rsosor.designpatterns.templatemethodpattern;

import com.macro.rsosor.designpatterns.templatemethodpattern.sub.SoftwareManager;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void test() {
        SoftwareManager softwareManager = new SoftwareManager();

        softwareManager.completeSoftware();

        softwareManager.redoSoftware();
    }
}
