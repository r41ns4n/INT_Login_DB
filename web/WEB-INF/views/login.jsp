<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 02.03.2018
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<p>${errorMessage}</p>

<form action="/login.do" method="post">
    <p>Name: <input type="text" name="name"/></p>
    <p>Passwort: <input type="password" name="password"/></p>
    <input type="submit" value="Anmelden">
</form>

</body>
</html>