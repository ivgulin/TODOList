package com.mokujin.module08;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mokujin on 09.10.16.
 */
public class CheckboxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String[] checkboxDecisions = request.getParameterValues("isComplete");
        List<Task> tasks = (ArrayList) session.getAttribute("tasks");

        for (int i = 0; i < tasks.size(); i++) {
            if (checkboxDecisions[i] == "true") {
                tasks.remove(i);
            }
        }
        session.setAttribute("tasks",tasks);
    }
}
