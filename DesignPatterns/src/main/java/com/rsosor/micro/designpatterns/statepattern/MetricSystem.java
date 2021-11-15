package com.rsosor.micro.designpatterns.statepattern;

public class MetricSystem {

    private State state;

    public void setState(final State state) {
        this.state = state;
    }

    public void tempView(Double temp) {
        System.out.println(state.tempToDisplay(temp));
    }

    public void vibView(Double vib) {
        System.out.println(state.vibToDisplay(vib));
    }

    public void tempSave(Double temp) {
        System.out.println(state.tempToSave(temp));
    }

    public void vibSave(Double vib) {
        System.out.println(state.vibToSave(vib));
    }
}
