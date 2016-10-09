package com.mokujin.module08;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDoListServlet extends HttpServlet {

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
    private String name = sdf.format(new Date());


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Task> tasks = new ArrayList<>();
        System.out.println(name);
        HttpSession session = request.getSession();

        if (session.getAttribute("tasks") == null) {
            session.setAttribute("tasks", tasks);
        } else {
            tasks = (ArrayList) session.getAttribute("tasks");
        }
        String taskName = request.getParameter("task_name");
        String taskCategory = request.getParameter("task_category");

        Task task = new Task(taskName, taskCategory);
        tasks.add(task);

        session.setAttribute("tasks", tasks);
    }
}















