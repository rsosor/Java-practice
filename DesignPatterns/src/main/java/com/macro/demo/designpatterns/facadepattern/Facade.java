package com.macro.demo.designpatterns.facadepattern;

public class Facade {

    private SubClassOne one;

    private SubClassTwo two;

    private SubClassThree three;

    private ClassOne four;

    public Facade() {
        one = new SubClassOne();
        two = new SubClassTwo();
        three = new SubClassThree();
        four = new ClassOne();
    }

    public void MethodA() {
        four.MethodFour();
        one.MethodOne();
    }

    public void MethodB() {
        two.MethodTwo();
        three.MethodThree();
    }
}
