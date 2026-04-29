package com.fyfe.proxy.dynamicProxy.cglib;

public class DatabaseDataQuery {

    public String query(String queryKey) {
        // 从数据库查询数据慢
        System.out.println("正在从数据库查询数据");
        return "result";
    }

    public String queryAll(String queryKey) {
        System.out.println("正在从数据库查询数据 all");
        return "all result";
    }
}
