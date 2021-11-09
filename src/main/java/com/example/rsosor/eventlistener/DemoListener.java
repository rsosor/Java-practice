package com.example.rsosor.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        List<Map> msg = event.getMsg();
        String type = event.getType();
        System.out.println("listener 接收到了 publisher 傳送的訊息型別: " + type + ", 訊息內容: " + msg);
    }
}
