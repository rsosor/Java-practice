package com.macro.demo.designpatterns.templatemethodpattern;

import com.macro.demo.designpatterns.templatemethodpattern.sub.SoftwareManager;

public class Test {

    public static void main(String[] args) {
        SoftwareManager softwareManager = new SoftwareManager();

        softwareManager.completeSoftware();

        softwareManager.redoSoftware();
    }
}
