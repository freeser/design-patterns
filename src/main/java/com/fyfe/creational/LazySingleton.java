package com.fyfe.creational;

/**
 * 懒汉式单例的实现
 */
public class LazySingleton {
    // 1、持有一个jvm全局唯一的实例
    private static LazySingleton instance;

    // 2、为了避免别人随意的创建，我们需要私有化构造器
    private LazySingleton() {}

    // 3、暴露一个方法，用来获取实例 synchronized 可以用来保证线程安全
    public  static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
