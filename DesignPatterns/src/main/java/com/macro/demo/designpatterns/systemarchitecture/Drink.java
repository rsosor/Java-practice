package com.macro.demo.designpatterns.systemarchitecture;

public abstract class Drink {

    SugarType sugarType;
    IceType iceType;

    private Drink() {}

    public Drink(SugarType sugarType, IceType iceType) {
        this.sugarType = sugarType;
        this.iceType = iceType;
    }

    public SugarType getSugarType() {
        return sugarType;
    }

    public void setSugarType(SugarType sugarType) {
        this.sugarType = sugarType;
    }

    public IceType getIceType() {
        return iceType;
    }

    public void setIceType(IceType iceType) {
        this.iceType = iceType;
    }

    public enum SugarType {
        REGULAR, LESS, HALF, QUARTER, FREE
    }

    public enum IceType {
        REGULAR, EASY, FREE, HOT
    }
}
