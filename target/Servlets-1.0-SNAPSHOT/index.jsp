<%@ page import="com.mokujin.module08.Task" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: mokujin
  Date: 09.10.16
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDoList</title>
</head>
<body>
<%List<Task> tasks = (ArrayList) session.getAttribute("tasks");%>
<table width="100%" border="1" align="center">
    <tr bgcolor=\"#8a2be2\">
        <th>Name</th>
        <th>Category</th>
        <th>Complete</th>
    </tr>
    <form action="check" method="get">
        <% for (int i = 0; i < tasks.size(); i++) { %>
        <tr>
            <td><%out.println(tasks.get(i).getTaskName());%></td>
            <td><%out.println(tasks.get(i).getTaskCategory());%></td>
            <td><input type="checkbox" name="isComplete" value="true"/></td>
        </tr>
        <%}%>
        <td align="right" colspan="2"><input type="submit" value="Update"/></td>
    </form>
</table>


</body>
</html>
