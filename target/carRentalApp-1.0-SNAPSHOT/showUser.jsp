<%@ page import="org.kosiuk.webapp.carRentalApp.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.02.2021
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ page import="org.kosiuk.webapp.carRentalApp.entity.User" %>

    <% User user = (User) session.getAttribute("user"); %>
    <p><%=user.getUsername() %></p>
    <p><%=user.getEmail() %></p>
    <p><%=user.getPassword() %></p>
    <p><%=user.getActive() %></p>
</body>
</html>
