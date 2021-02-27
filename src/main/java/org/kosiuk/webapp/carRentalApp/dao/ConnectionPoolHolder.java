package org.kosiuk.webapp.carRentalApp.dao;

import javax.sql.DataSource;

import org.apache.*;
import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPoolHolder {

    private static volatile DataSource dataSource;
    public static DataSource getDataSource(){

        if (dataSource == null){
            synchronized (ConnectionPoolHolder.class) {
                if (dataSource == null) {
                    BasicDataSource ds = new BasicDataSource();
                    ds.setUrl("jdbc:mysql://localhost:3306/car_rental_servlet_app_db");
                    ds.setUsername("root");
                    ds.setPassword("juga1204");
                    ds.setMinIdle(5);
                    ds.setMaxIdle(10);
                    ds.setMaxOpenPreparedStatements(100);
                    dataSource = ds;
                }
            }
        }
        return dataSource;

    }

}
