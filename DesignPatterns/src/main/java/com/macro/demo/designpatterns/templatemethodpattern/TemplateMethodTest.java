package com.macro.demo.designpatterns.templatemethodpattern;

import com.macro.demo.designpatterns.templatemethodpattern.sub.SoftwareManager;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    public void test() {
        SoftwareManager softwareManager = new SoftwareManager();

        softwareManager.completeSoftware();

        softwareManager.redoSoftware();
    }
}
