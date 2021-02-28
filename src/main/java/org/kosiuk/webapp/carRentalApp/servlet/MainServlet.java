package org.kosiuk.webapp.carRentalApp.servlet;

import org.kosiuk.webapp.carRentalApp.command.Command;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainServlet extends HttpServlet {

    private Map<String, Command> commands = new HashMap<>();

    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);

        /*HttpSession session = request.getSession();

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

        getServletContext().getRequestDispatcher("/showUser.jsp").forward(request, response);*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getRequestURI();
        System.out.println(path);
        path = path.replaceAll("[\\w]+/app", "");
        System.out.println(path);



    }
}
