package com.fyfe.observer.subscriber;

import java.util.HashMap;
import java.util.Map;

public class WeatherStation {
    private float temperature;
    private EventBus eventBus;

    public WeatherStation(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    public void changeTemperature(float temperature) {
        this.temperature = temperature;
        Map<String, Object> eventContext = new HashMap<>(2);
        eventContext.put("temp", Float.valueOf(temperature));
        eventBus.publish("changeTemperature", eventContext);
    }
    public static void main(String[] args) {
        // 创建订阅者
        AppSubscriber appSubscriber = new AppSubscriber();
        WebSubscriber webSubscriber = new WebSubscriber();

        // 构建消息总线
        EventBus bus = new EventBus();
        bus.register("changeTemperature", appSubscriber);
        bus.register("changeTemperature", webSubscriber);
        // 创建气象站
        new WeatherStation(bus).changeTemperature(36.9F);
    }
}
