<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 02.03.2018
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<html>
<head>
    <title>Bookstore</title>
    <style>
        .container {
            position: relative;
            top: 50px;
            left: 50px;
            width: 300px;
            background-color: #f5f5f5;
            border: 1px solid black;
            padding: 50px;
        }

    </style>

</head>


<div class="container">
<p>${errorMessage}</p>

<form action="login" method="post">
    <p>Name: <input type="text" name="name"/></p>
    <p>Passwort: <input type="password" name="password"/></p>
    <input type="submit" value="Anmelden" class="btn btn-success"/>
</form>

<p><a href="registrieren">Register</a></p>

</div>

</body>
</html>
