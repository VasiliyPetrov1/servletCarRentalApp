package org.kosiuk.webapp.carRentalApp.dao.impl;

import org.kosiuk.webapp.carRentalApp.dao.DAOFactory;
import org.kosiuk.webapp.carRentalApp.dao.impl.ConnectionPoolHolder;
import org.kosiuk.webapp.carRentalApp.dao.impl.JDBCUserDAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDAOFactory extends DAOFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();

    public JDBCUserDAO createUserDAO() {
        return new JDBCUserDAO(getConnection());
    }

    private Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
