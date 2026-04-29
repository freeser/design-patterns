package com.fyfe.bridge;

import com.fyfe.bridge.abstractor.Connection;
import com.fyfe.bridge.abstractor.Driver;
import com.fyfe.bridge.abstractor.DriverManagerOne;
import com.fyfe.bridge.implementor.MysqlDriver;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Driver driver = new MysqlDriver();
        Driver driver = (Driver) Class.forName("com.fyfe.bridge.implementor.OracleDriver").newInstance();

        DriverManagerOne driverManager = new DriverManagerOne();
        driverManager.register(driver);

        Connection connection = driverManager.getConnection();
        System.out.println(connection);
    }
}
