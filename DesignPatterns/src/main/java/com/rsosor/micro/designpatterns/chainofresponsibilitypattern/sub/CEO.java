package com.rsosor.micro.designpatterns.chainofresponsibilitypattern.sub;

import com.rsosor.micro.designpatterns.chainofresponsibilitypattern.Handler;
import com.rsosor.micro.designpatterns.chainofresponsibilitypattern.Trouble;

public class CEO extends Handler {

    @Override
    public void handleRequest(Trouble trouble) {
        System.out.println("CEO: " + trouble.getName() + "是誰叫他過來。");
    }
}
