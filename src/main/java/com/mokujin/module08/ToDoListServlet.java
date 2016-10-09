package com.mokujin.module08;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDoListServlet extends HttpServlet {

    private List<Task> tasks = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String taskName = request.getParameter("task_name");
        String taskCategory = request.getParameter("task_category");

        Task task = new Task(taskName, taskCategory);
        tasks.add(task);

        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("/adding.jsp").forward(request, response);
    }
}















