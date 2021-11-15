package com.rsosor.micro.designpatterns.compositepattern.sub;

import com.rsosor.micro.designpatterns.compositepattern.Component;

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
}
