package com.fyfe.bridge.abstractor;

public class DriverManagerTwo extends DriverManager {
    @Override
    public Connection getConnection() {
        System.out.println("这是由DriverManagerTwo管理的连接");
        return super.getConnection();
    }
}
