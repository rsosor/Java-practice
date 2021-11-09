package com.macro.rsosor.designpatterns.interpreterpattern.sub;

import com.macro.rsosor.designpatterns.interpreterpattern.AbstractExpression;
import com.macro.rsosor.designpatterns.interpreterpattern.BrowserContext;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(BrowserContext context) {
        System.out.println("終端的解釋器");
    }
}
