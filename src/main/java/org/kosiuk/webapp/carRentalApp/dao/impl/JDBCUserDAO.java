package org.kosiuk.webapp.carRentalApp.dao.impl;

import java.sql.Connection;

public class JDBCUserDAO {

    private Connection connection;

    public JDBCUserDAO(Connection connection) {
        this.connection = connection;
    }

}
