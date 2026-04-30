package com.fyfe.observer.asyc;

public interface Observer {

    /**
     * 当观察的行为发生了，应该被调用
     * @param temperature
     * @param humidity
     * @param pressure
     */
    void update(float temperature, float humidity, float pressure);
}