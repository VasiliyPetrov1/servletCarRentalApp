package org.kosiuk.webapp.carRentalApp.service;

import org.kosiuk.webapp.carRentalApp.dao.impl.JDBCUserDAO;
import org.kosiuk.webapp.carRentalApp.entity.User;

public class UserService {

    private static UserService instance;

    private JDBCUserDAO JDBCUserDAO;

    public void initDAO(JDBCUserDAO JDBCUserDAO) {
        this.JDBCUserDAO = JDBCUserDAO;
    }

    public static UserService getInstance() {
        if (instance == null) {
            synchronized (UserService.class) {
                if (instance == null) {
                    instance = new UserService();
                }
            }
        }
        return instance;
    }

    public User getUserByUsername(String username) {

        return null;

    }

}
