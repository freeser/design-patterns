package com.fyfe.proxy.dynamicProxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;

public class CacheMethodInterceptor implements MethodInterceptor {

    private HashMap<String,String> cache = new HashMap<>(256);
    private DatabaseDataQuery databaseDataQuery;

    public CacheMethodInterceptor(DatabaseDataQuery dbDataQuery) {
        this.databaseDataQuery = dbDataQuery;
    }
    public CacheMethodInterceptor() {
        this.databaseDataQuery = new DatabaseDataQuery();
    }
    
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
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
