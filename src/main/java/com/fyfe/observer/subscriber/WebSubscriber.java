package com.fyfe.observer.subscriber;

import java.util.Map;

public class WebSubscriber implements Subscriber {
    @Override
    public void onEvent(Map<String, Object> eventContext) {
        System.out.println("Web收到温度事件: " + eventContext.get("temp"));
    }
}