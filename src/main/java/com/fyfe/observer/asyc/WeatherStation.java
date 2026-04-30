package com.fyfe.observer.asyc;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 大气压
    private float pressure;

    private ExecutorService executorService;

    public WeatherStation() {}

    public WeatherStation(ExecutorService executorService) {
        this.executorService = executorService;
    }

    // 注册一个观察者的方法
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 移除一个观察者的方法
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    // 通知所有的观察者
    @Override
    public void notifyObservers() {
        // 循环所有的观察者，通知其当前的气象信息
        // 这里产生阻塞
        for (Observer o : observers) {
            // 如果传递了线程池，就异步通知
            if (executorService == null) {
                o.update(temperature, humidity, pressure);
            } else {
                executorService.execute(() -> o.update(temperature, humidity, pressure));
            }
        }

    }

    // 修改气象内容
    public void measurementsChanged() {
        notifyObservers();
    }

    // 当测量值发生了变化的时候
    public void changeTemperature(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 测量值发生了变化
        measurementsChanged();
    }
}