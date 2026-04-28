package com.fyfe.creational;

/**
 * 静态内部类的方式实现单
 */
public class InnerSingleton {
    private  InnerSingleton() {}
    public InnerSingleton getInstance() {
        return  InnerSingletonHolder.instance;
    }
    // 定义内部类来持有实例
    // 特性，类加载的时机 ---》 一个类会在被第一次主动使用的时候被加载
    // 实例会在内部类加载（调用getInstance方法的时候）会创建
    private static class InnerSingletonHolder{
        private static final InnerSingleton instance = new InnerSingleton();
    }
}
