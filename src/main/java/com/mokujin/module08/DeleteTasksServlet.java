package com.mokujin.module08;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeleteTasksServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String[] checkboxDecisions = request.getParameterValues("isComplete");
        List<Task> tasks = (ArrayList) session.getAttribute("tasks");

        if (tasks != null && checkboxDecisions != null) {
            int[] checkboxDecisionsInInteger = new int[checkboxDecisions.length];

            for (int i = 0; i < checkboxDecisions.length; i++) {
                checkboxDecisionsInInteger[i] = Integer.parseInt(checkboxDecisions[i]);
            }

            for (int i = 0; i < checkboxDecisionsInInteger.length; i++) {
                tasks.remove(checkboxDecisionsInInteger[i]);
                if (i != checkboxDecisionsInInteger.length - 1) {
                    checkboxDecisionsInInteger[i + 1] = checkboxDecisionsInInteger[i + 1] - 1;
                }
            }
            session.setAttribute("tasks", tasks);
            session.setAttribute("badRequest", false);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            session.setAttribute("badRequest", true);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
