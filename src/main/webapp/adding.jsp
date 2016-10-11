<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>ToDo List</title>
    <link rel="stylesheet" type="text/css" href="table.css">
</head>
<body>
<c:if test="${sessionScope.get(\"badRequest\")==true}">
    <div><c:out value="Wrong task properties. Repeat please."/></div>
</c:if>
<form action="todo" method="post">
    <table class="center">
        <tr>
            <td>Task Name:</td>
            <td><input type="text" name="taskName"></td>
        </tr>
        <tr>
            <td>Task Category:</td>
            <td><input type="text" name="taskCategory"/></td>
        </tr>
    </table>
    <input type="submit" class="button" id="2" value="Add Task"/>
</form>
</body>
</html>