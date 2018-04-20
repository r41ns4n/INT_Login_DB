<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 20.04.2018
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Book</title>
</head>
<body>
<p>Create new Book:</p>

<form method="post" action="addBooks.do">
    Titel:<input type="text" name="title" /><br>
    Autor:<input type="text" name="autor" /><br>
    ISBN:<input type="text" name="ISBN" /><br>
    <input type="submit" value="Save">
</form>

</body>
</html>
