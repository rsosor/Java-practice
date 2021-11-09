package com.macro.rsosor.designpatterns.systemarchitecture.impl;

import com.macro.rsosor.designpatterns.systemarchitecture.Drink;

public class Tea extends Drink {

    TeaType teaType;

    public Tea(SugarType sugarType, IceType iceType) {
        super(sugarType, iceType);
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public enum TeaType {
        LEMON, OOLONG, GINGER, HONEY
    }
}
