<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<%List<Task> tasks = (ArrayList) request.getAttribute("tasks");%>
<%if (tasks != null) {%>
<table width="100%" border="1" align="center">
    <tr bgcolor=\"#8a2be2\">
        <th>Name</th>
        <th>Category</th>
        <th>Complete</th>
    </tr>
    <% for (Task task : tasks) { %>
    <tr>
        <td><%out.println(task.getTaskName());%></td>
        <td><%out.println(task.getTaskCategory());%></td>
        <td><input type="checkbox" name="is_complete" value="yes"/></td>
    </tr>
    <%}%>
</table>
<%}%>


<form action="todo" method="get">
    <table>
        <tr>
            <td>Task Name:</td>
            <td><input type="text" name="task_name"></td>
        </tr>
        <tr>
            <td>Task Category:</td>
            <td><input type="text" name="task_category"/></td>
        </tr>
        <td align="right" colspan="2"><input type="submit" value="Add Task"/></td>
    </table>
</form>
</body>
</html>