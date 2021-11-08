package com.macro.demo.designpatterns.adapterpattern;

public class Client {

    private People people;

    public Client(People people) {
        this.people = people;
    }

    public void hello() {
        people.hello();
    }

    public void selfIntro() {
        people.selfIntro();
    }
}
