package com.rsosor.micro.designpatterns.interpreterpattern.sub;

import com.rsosor.micro.designpatterns.interpreterpattern.AbstractExpression;
import com.rsosor.micro.designpatterns.interpreterpattern.BrowserContext;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(BrowserContext context) {
        System.out.println("終端的解釋器");
    }
}
