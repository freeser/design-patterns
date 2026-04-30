package com.fyfe.observer.spring;

import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // 创建一个多播器
        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        // 下面这个设置了就是异步，否则就是同步
        multicaster.setTaskExecutor(Executors.newFixedThreadPool(3));
        // 定义一个事件
        TempChangeApplicationEvent event = new TempChangeApplicationEvent(25.6F);

        // 注册一个观察者
        multicaster.addApplicationListener(new AppListener());
        multicaster.addApplicationListener(new WebListener());
        // 文件事件
        multicaster.multicastEvent(event);
    }
}
