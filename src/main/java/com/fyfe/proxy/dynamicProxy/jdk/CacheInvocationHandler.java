package com.fyfe.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CacheInvocationHandler implements InvocationHandler {

    private HashMap<String,String> cache = new HashMap<>(256);

    private DatabaseDataQuery databaseDataQuery;

    public CacheInvocationHandler(DatabaseDataQuery dbDataQuery) {
        this.databaseDataQuery = dbDataQuery;
    }
    public CacheInvocationHandler() {
        this.databaseDataQuery = new DatabaseDataQuery();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String result = null;
        // 1、判断是哪个方法
        if ("query".equals(method.getName())) {
            // 2、查缓存，命中直接返回
            result = cache.get(args[0].toString());
            if (result != null) {
                System.out.println("数据从缓存中获取");
                return result;
            }

            // 3、未命中，查数据库（需要代理实例）
            result  = (String) method.invoke(databaseDataQuery, args);

            // 4、如果查询到了，就进行缓存
            cache.put(args[0].toString(), result);
            return result;
        }
        // 当其它的方法被调用，不希望被干预，直接调用原生的方法
        return method.invoke(databaseDataQuery, args);
    }
}
