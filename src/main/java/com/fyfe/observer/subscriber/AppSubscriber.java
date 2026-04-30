package com.fyfe.observer.subscriber;

import java.util.Map;

public class AppSubscriber implements Subscriber {
    @Override
    public void onEvent(Map<String, Object> eventContext) {
        System.out.println("App收到温度事件: " + eventContext.get("temp"));
    }
}