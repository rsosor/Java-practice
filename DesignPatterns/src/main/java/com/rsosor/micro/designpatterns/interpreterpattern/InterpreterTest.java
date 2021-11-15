package com.rsosor.micro.designpatterns.interpreterpattern;

import com.rsosor.micro.designpatterns.interpreterpattern.sub.NonTerminalExpression;
import com.rsosor.micro.designpatterns.interpreterpattern.sub.TerminalExpression;
import org.junit.jupiter.api.Test;

public class InterpreterTest {

    @Test
    public void test() {
        BrowserContext context = new BrowserContext();

        // 先用語法分析器，將語句分類，選擇要用哪種解釋器解釋

        /**
         * 做了各種分類
         */

        // 兩種解釋器
        AbstractExpression terminal = new TerminalExpression();
        AbstractExpression nonTerminal = new NonTerminalExpression();


        /**
         * 不同的詞句要對應到對的解釋器
         */

        // 終端的丟進終端解釋
        terminal.interpret(context);
        // 非終端的丟進非終端解釋
        nonTerminal.interpret(context);
    }
}
