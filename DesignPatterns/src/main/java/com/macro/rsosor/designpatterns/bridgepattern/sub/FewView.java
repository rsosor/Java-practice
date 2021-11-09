package com.macro.rsosor.designpatterns.bridgepattern.sub;

import com.macro.rsosor.designpatterns.bridgepattern.View;

public class FewView extends View {

    @Override
    public void show() {
        resources.photo();
        resources.snippet();
    }
}
