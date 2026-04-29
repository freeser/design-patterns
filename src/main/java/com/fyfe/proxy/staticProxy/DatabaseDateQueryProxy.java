package com.fyfe.proxy.staticProxy;

import java.util.HashMap;

public class DatabaseDateQueryProxy implements DataQuery {

    // 我们要实现缓存，需要一个数据结构
    HashMap<String, String> cache = new HashMap<>(256);

    // 你代理谁就持有谁
    private DatabaseDataQuery dataQuery;

    public DatabaseDateQueryProxy() {
        // 1、屏蔽被代理对象
        this.dataQuery = new DatabaseDataQuery();
    }

    @Override
    public String query(String queryKey) {
        // 2、对被代理对象的方法做增强

        // 查询缓存
        String result = cache.get(queryKey);
        if (result != null) {
            System.out.println("命中缓存，走缓存");
            return  result;
        }
        result = dataQuery.query(queryKey);
        if (result != null) {
            cache.put(queryKey, result);
        }
        System.out.println("未命中，走持久层");
        return result;
    }
}
