package com.fyfe.observer.spring;

import org.springframework.context.ApplicationListener;

public class AppListener  implements ApplicationListener<TempChangeApplicationEvent> {
    @Override
    public void onApplicationEvent(TempChangeApplicationEvent event) {
        System.out.println("app ==> 温度发生改变" + event.getSource());
    }
}
