<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 13.04.2018
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!-- Include Header -->
<%@include file="../common/header.jspf" %>

<!-- Include Navigation -->
<%@include file="../common/navigation.jspf" %>

<!-- Main Container -->
<div class="container">

<h1>Bücherliste</h1>
<p>Ihre Bücher sind Test:</p>
<table  class="table table-striped">
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.ISBN}</td>
            <td>${book.title}</td>
            <td>${book.autor}</td>
            <td><a href="deleteBooks.do?id=${book.id}" class="btn btn-danger"> delete</a></td>
        </tr>
    </c:forEach>
</table>

    <form action="addBooks.do" method="get">
        <input type="submit" name="addBook" value="Add new Book" class="btn btn-success">
    </form>

    <!--  <a href="addBooks.do"  class="btn btn-success">new Book</a> -->

    </div>

    <!-- Include Footer -->
<%@include file="../common/footer.jspf" %>