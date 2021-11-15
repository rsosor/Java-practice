package com.rsosor.micro.designpatterns.bridgepattern.impl;

import com.rsosor.micro.designpatterns.bridgepattern.Resources;

public class Book implements Resources {

    @Override
    public void photo() {
        System.out.println("書本的照片");
    }

    @Override
    public void snippet() {
        System.out.println("書本的簡短說明");
    }

    @Override
    public void describe() {
        System.out.println("書本的詳細說明");
    }
}
