package com.rsosor.featurestest.eventlistener;

import org.springframework.context.ApplicationEvent;

import java.util.List;
import java.util.Map;


public class DemoEvent extends ApplicationEvent {

    private String type;

    private List<Map> msg;

    public DemoEvent(Object object, String type, List<Map> msg) {
        super(object);
        this.type = type;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Map> getMsg() {
        return msg;
    }

    public void setMsg(List<Map> msg) {
        this.msg = msg;
    }
}
