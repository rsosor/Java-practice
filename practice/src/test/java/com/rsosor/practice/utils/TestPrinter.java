package com.rsosor.practice.utils;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * 自定義 Rule
 *
 * @author RsosoR
 * @date 2021/12/5
 */
public class TestPrinter implements TestRule {

    /**
     * 會在測試案例的前後執行動作
     */
    @Override
    public Statement apply(Statement statement, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("start " + description.getDisplayName());
                statement.evaluate();
                System.out.println("end " + description.getDisplayName());
            }
        };
    }
}
