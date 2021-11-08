package com.macro.demo.designpatterns.interpreterpattern.sub;

import com.macro.demo.designpatterns.interpreterpattern.AbstractExpression;
import com.macro.demo.designpatterns.interpreterpattern.BrowserContext;

public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(BrowserContext context) {
        System.out.println("非終端的解釋器");
    }
}
