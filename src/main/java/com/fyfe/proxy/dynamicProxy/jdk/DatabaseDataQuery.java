package com.fyfe.proxy.dynamicProxy.jdk;

public class DatabaseDataQuery implements DataQuery {


    @Override
    public String query(String queryKey) {
        // 从数据库查询数据慢
        System.out.println("正在从数据库查询数据");
        return "result";
    }

    @Override
    public String queryAll(String queryKey) {
        System.out.println("正在从数据库查询数据 all");
        return "all result";
    }
}
