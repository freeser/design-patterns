package com.fyfe.observer.spring;

import org.springframework.context.ApplicationEvent;

public class TempChangeApplicationEvent extends ApplicationEvent {

    public TempChangeApplicationEvent(Float newTemp) {
        super(newTemp);
    }
}
