<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.mokujin.module08.ToDoListServlet" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="com.mokujin.module08.Task" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: mokujin
  Date: 07.10.16
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo List</title>
</head>
<body>
<form action="todo" method="post">
    <table>
        <tr>
            <td>Task Name:</td>
            <td><input type="text" name="taskName"></td>
        </tr>
        <tr>
            <td>Task Category:</td>
            <td><input type="text" name="taskCategory"/></td>
        </tr>
        <td align="right" colspan="2"><input type="submit" value="Add Task"/></td>
    </table>
    </form>
</body>
</html>