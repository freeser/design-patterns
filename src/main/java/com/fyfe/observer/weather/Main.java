package com.fyfe.observer.weather;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
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