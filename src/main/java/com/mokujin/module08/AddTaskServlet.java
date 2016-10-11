package com.mokujin.module08;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddTaskServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Task> tasks;
        HttpSession session = request.getSession();

        if (session.getAttribute("tasks") == null) {
            tasks = new ArrayList<>();
            session.setAttribute("tasks", tasks);
        }
        tasks = (List<Task>) session.getAttribute("tasks");
        String taskName = request.getParameter("taskName");
        String taskCategory = request.getParameter("taskCategory");
        Task task = new Task(taskName, taskCategory);
        tasks.add(task);

        session.setAttribute("tasks",tasks);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}















