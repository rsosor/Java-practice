package com.macro.rsosor.designpatterns.bridgepattern.sub;

import com.macro.rsosor.designpatterns.bridgepattern.View;

public class FullView extends View {

    @Override
    public void show() {
        resources.photo();
        resources.describe();
    }
}
