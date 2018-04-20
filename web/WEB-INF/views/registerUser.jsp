<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 09.03.2018
  Time: 09:27
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

<form method="post" action="registrieren">
    <p>Benutzer: <input type="text" name="username"></p>
    <p>Passwort: <input type="password" name="password"></p>
    <p><input type="submit" value="Register" class="btn btn-success"></p>

</form>

</div>

</body>
</html>

