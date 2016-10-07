<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: mokujin
  Date: 07.10.16
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Headers</title>
</head>
<body>
    <h2>My TODO List</h2>
    <table width="100%" border="1" align="center">
        <tr bgcolor="#8a2be2">
            <th>Name</th>
            <th>Category</th>
            <th>Complete</th>
        </tr>
    </table>

    <c:forEach items="${requestScope.keySet()}" var="headerName">
        <tr>
            <td><c:out value="${headerName}"/></td>
            <td><c:out value="${param.get(headerName)}"/></td>
            <td></td>
        </tr>
    </c:forEach>

    <form action="todo" method="post">
    Task Name:     <input type="text" name="task_name">
    <br/>
    Task Category: <input type="text" name="task_category"/>
    <br/>
    <input type="submit" value="Add Task"/>
    </form>
</body>
</html>
