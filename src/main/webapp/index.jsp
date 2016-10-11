<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDoList</title>
    <link rel="stylesheet" type="text/css" href="table.css">
</head>
<body>
<c:if test="${sessionScope.get(\"badRequest\")==true}">
    <div class="red"><c:out value="There is no signed tasks!"/></div>
</c:if>
<c:set var="tasks" value="${sessionScope.get(\"tasks\")}"/>
<c:choose>
    <c:when test="${fn:length(tasks) == 0}">
        <h3>No more tasks left. To add new task click here: </h3>
        <form action="adding.jsp">
            <button type="submit" class="button" id="unique">Add Task</button>
        </form>
    </c:when>
    <c:otherwise>
        <table class="center">
            <tr>
                <th>Name</th>
                <th class="smaller">Category</th>
                <th class="smaller">Complete</th>
            </tr>
            <form action="delete" method="post">
                    <c:set var="counter" value="${-1}"/>
                <c:forEach var="task" items="${tasks}">
                <tr>
                    <td><c:out value="${task.taskName}"/></td>
                    <td><c:out value="${task.taskCategory}"/></td>
                    <c:set var="counter" value="${counter+1}"/>
                    <td><input type="checkbox" name="isComplete" value="${counter}"/></td>
                </tr>
                </c:forEach>
        </table>
        <td align="right" colspan="2"><input type="submit" class="button" value="Update Tasks"/></td>
        </form>

        <form action="adding.jsp">
            <button type="submit" class="button">Add Task</button>
        </form>
    </c:otherwise>
</c:choose>
</body>
</html>
