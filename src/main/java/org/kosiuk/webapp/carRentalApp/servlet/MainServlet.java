package org.kosiuk.webapp.carRentalApp.servlet;

import org.kosiuk.webapp.carRentalApp.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Boolean active = Boolean.valueOf(request.getParameter("active"));

        if (user == null) {
            user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            user.setActive(active);
            session.setAttribute("user", 1);
        }

        session.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/showUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
