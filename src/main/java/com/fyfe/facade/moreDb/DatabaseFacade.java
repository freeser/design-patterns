package com.fyfe.facade.moreDb;

public class DatabaseFacade {
    private Database mysqlDatabase;
    private Database oracleDatabase;

    public DatabaseFacade() {
        mysqlDatabase = new MySQLDatabase();
        oracleDatabase = new OracleDatabase();
    }

    public void executeSQL(String sql, String databaseType) {
        if ("mysql".equalsIgnoreCase(databaseType)) {
            mysqlDatabase.execute(sql);
        } else if ("oracle".equalsIgnoreCase(databaseType)){
            oracleDatabase.execute(sql);
        } else {
            throw new IllegalArgumentException("Unknown database type: " + databaseType);
        }
    }
}
