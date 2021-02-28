package org.kosiuk.webapp.carRentalApp.command;

import org.kosiuk.webapp.carRentalApp.service.UserService;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {

    private UserService userService;

    public Login() {
        userService = new UserService();
    }

    @Override
    public String execute(HttpServletRequest request) {

        return null;
    }
}
