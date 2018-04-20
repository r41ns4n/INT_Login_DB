<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 13.04.2018
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Bücherliste</title>
</head>
<body>
<h1>Bücherliste</h1>
<p>Ihre Bücher sind Test:</p>
<table>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.ISBN}</td>
            <td>${book.title}</td>
            <td>${book.autor}</td>
            <td><a href="deleteBooks.do?id=${book.id}"> delete</a></td>
        </tr>
    </c:forEach>
</table>

<a href="addBooks.do">new Book</a>

</body>

</html>