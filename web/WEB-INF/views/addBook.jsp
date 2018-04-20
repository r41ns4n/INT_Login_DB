<%--
  Created by IntelliJ IDEA.
  User: mjungwirth
  Date: 20.04.2018
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Include Header -->
<%@include file="../common/header.jspf" %>

<!-- Include Navigation -->
<%@include file="../common/navigation.jspf" %>

<div class="container">

<p>Create new Book:</p>

<form method="post" action="addBooks.do">
    <p>Titel: <input type="text" name="title" /></p>
    <p> Autor: <input type="text" name="autor" /></p>
    <p>ISBN:  <input type="text" name="ISBN" /></p>
    <p> <input type="submit" value="Save" class="btn btn-success"></p>
</form>

</div>
<!-- Include Footer -->
<%@include file="../common/footer.jspf" %>
