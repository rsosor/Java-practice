package com.macro.demo.designpatterns.strategypattern;

import com.macro.demo.designpatterns.strategypattern.impl.Add;
import com.macro.demo.designpatterns.strategypattern.impl.Divide;
import com.macro.demo.designpatterns.strategypattern.impl.Minus;
import com.macro.demo.designpatterns.strategypattern.impl.Multiply;
import org.springframework.lang.NonNull;


public class Calculator {

    private int now = 0;

    private IStrategy strategy;

    // 策略模式
    public int execute(int a, int b) {
        return strategy.calculate(a, b);
    }

    public void reset() {
        this.now = 0;
    }

    // 簡單工廠模式
    public void setStrategy(@NonNull DoType dotype) {
        switch (dotype) {
            case ADD:
                this.strategy = new Add();
                break;
            case MINUS:
                this.strategy = new Minus();
                break;
            case DIVIDE:
                this.strategy = new Divide();
                break;
            case MULTIPLY:
                this.strategy = new Multiply();
                break;
        }
    }

    enum DoType {
        ADD, MINUS, DIVIDE, MULTIPLY
    }
}
