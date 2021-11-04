package com.example.demo.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String type, List<Map> msg) {
        applicationContext.publishEvent(new DemoEvent(this, type, msg));
    }
}
