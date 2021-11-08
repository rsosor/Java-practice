package com.macro.demo.designpatterns.interpreterpattern.sub;

import com.macro.demo.designpatterns.interpreterpattern.AbstractExpression;
import com.macro.demo.designpatterns.interpreterpattern.BrowserContext;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(BrowserContext context) {
        System.out.println("終端的解釋器");
    }
}
