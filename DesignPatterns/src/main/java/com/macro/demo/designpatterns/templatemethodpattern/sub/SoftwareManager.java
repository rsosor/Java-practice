package com.macro.demo.designpatterns.templatemethodpattern.sub;

import com.macro.demo.designpatterns.templatemethodpattern.BossMethod;

public class SoftwareManager extends BossMethod {

    @Override
    protected String UI_Design() {
        System.out.println("找一個 UI Design 做");
        return "UI 成果";
    }

    @Override
    protected String systemAnalysis() {
        System.out.println("找一個軟體分析師做");
        return "軟體分析成果";
    }

    @Override
    protected String systemDesign() {
        System.out.println("找一個系統設計師做");
        return "系統設計成果";
    }

    @Override
    protected String programming() {
        System.out.println("找一個軟體工程師做");
        return "程式成果";
    }

    @Override
    protected String test() {
        System.out.println("找一個測試工程師做");
        return "測試成果";
    }
}
