package com.fyfe.proxy.dynamicProxy.jdk;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // jdk提供的代理实现，主要是使用Proxy类来完成
        // 1、classLoader: 被代理类的加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class[] interfaces = new Class[]{DataQuery.class};

        CacheInvocationHandler invocationHandler = new CacheInvocationHandler();
        DataQuery dataQuery = (DataQuery) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        // 事实上调用query方法的使用，是调用了invoke
        String value = dataQuery.query("key1");
        System.out.println(value);

        value = dataQuery.query("key1");
        System.out.println(value);

        value = dataQuery.query("key2");
        System.out.println(value);

        System.out.println("++++++++++++++++++++++++++");

        // 事实上调用queryAll方法的使用，也是调用了invoke
        value = dataQuery.queryAll("key1");
        System.out.println(value);

        value = dataQuery.queryAll("key1");
        System.out.println(value);

        value = dataQuery.queryAll("key2");
        System.out.println(value);
    }
}
