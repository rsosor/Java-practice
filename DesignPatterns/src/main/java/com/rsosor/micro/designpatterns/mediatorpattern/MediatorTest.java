package com.rsosor.micro.designpatterns.mediatorpattern;

import com.rsosor.micro.designpatterns.mediatorpattern.impl.Boss;
import com.rsosor.micro.designpatterns.mediatorpattern.impl.PM;
import com.rsosor.micro.designpatterns.mediatorpattern.impl.Programmer;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void test() {
        Boss boss = new Boss();

        PM phen = new PM("小芬");
        Programmer san = new Programmer("小姍");
        Programmer chen = new Programmer("小淺");

        boss.addMember(phen);
        boss.addMember(san);
        boss.addMember(chen);

        boss.introduce(san);

        chen.work();

        boss.workHard();

        phen.bossHelp(san);
    }
}
