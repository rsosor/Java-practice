package com.macro.demo.designpatterns.adapterpattern;

public class EarthMan {

    private People people;

    public EarthMan(People people) {
        this.people = people;
    }

    public void hello() {
        people.hello();
    }

    public void selfIntro() {
        people.selfIntro();
    }
}
