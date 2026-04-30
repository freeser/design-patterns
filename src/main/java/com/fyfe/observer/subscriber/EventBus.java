package com.fyfe.observer.subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    // 使用一个map维护，消息类型和该消息的订阅者
    private Map<String, List<Subscriber>> subscribers = new HashMap<>(8);

    // 订阅一个消息
    public void register(String eventType, Subscriber subscriber) {
        subscribers.computeIfAbsent(eventType, k -> new ArrayList<>()).add(subscriber);
        subscribers.get(eventType).add(subscriber);
    }

    // 接触订阅
    public void remove(String eventType, Subscriber subscriber) {
        List<Subscriber> subs = subscribers.get(eventType);
        if (subs != null) {
            subs.remove(subscriber);
        }
    }

    // 发布事件
    public void publish(String eventType, Map<String, Object> eventContext) {
        List<Subscriber> subs = subscribers.get(eventType);
        if (subs != null) {
            for (Subscriber subscriber : subs) {
                subscriber.onEvent(eventContext);
            }
        }
    }
}