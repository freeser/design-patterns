package com.fyfe.observer.asyc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        // 传service就走线程池，异步执行，否则就同步
        WeatherStation weatherStation = new WeatherStation(service);
        PhoneApp phoneApp = new PhoneApp(weatherStation);
        WebApp webApp = new WebApp(weatherStation);

        // 模拟气象站数据更新
        weatherStation.changeTemperature(25, 65, 1010);
        weatherStation.changeTemperature(22, 58, 1005);

        // 添加更多观察者  网站上显示-电子大屏
//        ElectronicScreen electronicScreen = new ElectronicScreen(weatherStation);

        // 再次模拟气象站数据更新
        weatherStation.changeTemperature(18, 52, 1008);
    }
}