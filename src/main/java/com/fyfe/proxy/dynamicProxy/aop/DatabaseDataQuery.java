package com.fyfe.proxy.dynamicProxy.aop;

import org.springframework.stereotype.Component;

@Component
public class DatabaseDataQuery implements DataQuery {
    @Override
    public String query(String queryKey) {
        // 从数据库查询数据慢
        System.out.println("正在从数据库查询数据");
        return "result";
    }
}
