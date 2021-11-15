package com.rsosor.micro.designpatterns.bridgepattern.sub;

import com.rsosor.micro.designpatterns.bridgepattern.View;

public class FullView extends View {

    @Override
    public void show() {
        resources.photo();
        resources.describe();
    }
}
