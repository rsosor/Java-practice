package com.rsosor.micro.designpatterns.adapterpattern;

public class Man {

    String name;

    public Man(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("你好，前面很危險");
    }

    public void selfIntro() {
        System.out.println("我是這裡最強壯的人，" + this.name);
    }
}
