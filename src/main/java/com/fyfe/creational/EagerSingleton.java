package com.fyfe.creational;

/**
 * 饿汉式单例的实现
 */
public class EagerSingleton {
    // 1、持有一个jvm全局唯一的实例
    private final static EagerSingleton instance = new EagerSingleton();

    // 2、为了避免别人随意的创建，我们需要私有化构造器
    private EagerSingleton() {}

    // 3、暴露一个方法，用来获取实例
    public static EagerSingleton getInstance() {
        return instance;
    }
}
