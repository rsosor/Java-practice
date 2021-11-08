package com.macro.demo.designpatterns.compositepattern.sub;

import com.macro.demo.designpatterns.compositepattern.Component;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Leaf can't add component");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Leaf can't remove component");
    }

    @Override
    public void display(int depth) {
        super.display(depth);
    }
}
