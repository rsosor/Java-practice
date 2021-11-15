package com.rsosor.micro.designpatterns.templatemethodpattern;

public abstract class BossMethod {

    private String bossThink() {
        return "我覺得這應該要這樣那樣。: ";
    }

    private String bossRedo() {
        return "這跟我想做的不一樣重新做。";
    }

    protected abstract String UI_Design();

    protected abstract String systemAnalysis();

    protected abstract String systemDesign();

    protected abstract String programming();

    protected abstract String test();

    public void completeSoftware() {
        System.out.println(bossThink() + UI_Design() + "\n" +
                        bossThink() + systemAnalysis() + "\n" +
                        bossThink() + systemDesign() + "\n" +
                        bossThink() + programming() + "\n" +
                        bossThink() + test()
        );
    }

    public void redoSoftware() {
        System.out.println(bossRedo());
        completeSoftware();
    }
}
