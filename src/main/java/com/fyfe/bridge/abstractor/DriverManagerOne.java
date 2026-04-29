package com.fyfe.bridge.abstractor;

public class DriverManagerOne extends DriverManager {
    @Override
    public Connection getConnection() {
        System.out.println("这是由DriverManagerOne管理的连接");
        return super.getConnection();
    }
}
