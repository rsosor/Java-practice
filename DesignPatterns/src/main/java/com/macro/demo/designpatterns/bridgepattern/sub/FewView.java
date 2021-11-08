package com.macro.demo.designpatterns.bridgepattern.sub;

import com.macro.demo.designpatterns.bridgepattern.View;

public class FewView extends View {

    @Override
    public void show() {
        resources.photo();
        resources.snippet();
    }
}
