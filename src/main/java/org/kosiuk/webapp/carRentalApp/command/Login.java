package org.kosiuk.webapp.carRentalApp.command;

import org.kosiuk.webapp.carRentalApp.constants.Path;
import org.kosiuk.webapp.carRentalApp.entity.User;
import org.kosiuk.webapp.carRentalApp.service.UserService;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {

    private UserService userService;

    public Login() {
        userService = new UserService();
    }

    @Override
    public String execute(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username == null || username.equals("") || password == null || password.equals("")){
            return "/logn.jsp";
        }

        User user = userService.getUserByUsername(username);

        return Path.LOGIN_PATH;
    }
}
