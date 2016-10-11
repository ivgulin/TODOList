<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo List</title>
    <link rel="stylesheet" type="text/css" href="table.css">
</head>
<body>
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
    <input type="submit" class="button" value="Add Task"/>
</form>
</body>
</html>