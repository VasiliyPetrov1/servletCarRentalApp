package org.kosiuk.webapp.carRentalApp.dao;

import org.kosiuk.webapp.carRentalApp.dao.impl.JDBCDAOFactory;
import org.kosiuk.webapp.carRentalApp.dao.impl.JDBCUserDAO;

public abstract class DAOFactory {

    private static DAOFactory daoFactory;

    public abstract JDBCUserDAO createUserDAO();

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DAOFactory.class) {
                if (daoFactory == null) {
                    DAOFactory temp = new JDBCDAOFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}