<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27.02.2021
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
    <form method="post" action="${pageContext.request.contextPath}/app/login">
        <input type="text" name="username"><br/>
        <input type="password" name="password"><br/><br/>
        <input class="button" type="submit" value="Login">
    </form>
    <br/>
    <a href="${pageContext.request.contextPath}/app/logout">Log Out</a>
</head>
<body>

</body>
</html>
