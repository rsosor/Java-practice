package com.macro.rsosor.designpatterns.chainofresponsibilitypattern.sub;

import com.macro.rsosor.designpatterns.chainofresponsibilitypattern.Handler;
import com.macro.rsosor.designpatterns.chainofresponsibilitypattern.Trouble;

public class Manager extends Handler {

    public Manager() {
        // 設定上級
        setSuccessor(new CEO());
    }

    @Override
    public void handleRequest(Trouble trouble) {
        if (trouble.getSize() > 5000) {
            successor.handleRequest(trouble);
        } else {
            System.out.println("Manager: " + trouble.getName() + "是小問題，不用擔心。");
        }
    }
}
