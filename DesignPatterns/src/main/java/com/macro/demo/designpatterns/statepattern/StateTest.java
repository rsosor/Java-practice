package com.macro.demo.designpatterns.statepattern;

import com.macro.demo.designpatterns.statepattern.sub.British;
import com.macro.demo.designpatterns.statepattern.sub.Metric;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void test() {
        MetricSystem metricSystem = new MetricSystem();
        metricSystem.setState(new Metric());

        metricSystem.tempView(50d);
        metricSystem.vibView(10d);
        metricSystem.tempSave(50d);
        metricSystem.vibSave(10d);

        metricSystem.setState(new British());

        metricSystem.tempView(50d);
        metricSystem.vibView(10d);
        metricSystem.tempSave(50d);
        metricSystem.vibSave(10d);
    }
}
