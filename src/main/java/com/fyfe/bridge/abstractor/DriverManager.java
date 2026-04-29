package com.fyfe.bridge.abstractor;

public abstract class DriverManager
{
    private Driver driver;
    public Connection getConnection() {
        return driver.connect();
    }
    public void register(Driver driver) {
        this.driver = driver;
    }
}
