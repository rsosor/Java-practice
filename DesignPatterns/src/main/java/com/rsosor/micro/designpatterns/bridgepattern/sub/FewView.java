package com.rsosor.micro.designpatterns.bridgepattern.sub;

import com.rsosor.micro.designpatterns.bridgepattern.View;

public class FewView extends View {

    @Override
    public void show() {
        resources.photo();
        resources.snippet();
    }
}
