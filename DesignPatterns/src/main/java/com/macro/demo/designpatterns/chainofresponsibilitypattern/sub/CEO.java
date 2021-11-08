package com.macro.demo.designpatterns.chainofresponsibilitypattern.sub;

import com.macro.demo.designpatterns.chainofresponsibilitypattern.Handler;
import com.macro.demo.designpatterns.chainofresponsibilitypattern.Trouble;

public class CEO extends Handler {

    @Override
    public void handleRequest(Trouble trouble) {
        System.out.println("CEO: " + trouble.getName() + "是誰叫他過來。");
    }
}
