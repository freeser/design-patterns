package com.fyfe.creational;

import java.util.concurrent.atomic.AtomicInteger;

public enum GlobalCounter {
    INSTANCE;
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public  Integer  getNumber() {
        return atomicInteger.getAndIncrement();
    }
}
