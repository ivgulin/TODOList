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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String[] checkboxDecisions = request.getParameterValues("isComplete");
        List<Task> tasks = (ArrayList) session.getAttribute("tasks");
        int[] checkboxDecisionsInInteger = new int[checkboxDecisions.length];

        for (int i = 0; i < checkboxDecisions.length; i++) {
            checkboxDecisionsInInteger[i] = Integer.parseInt(checkboxDecisions[i]);
        }

        int k = 0;
        for (int i = 0; i < tasks.size(); i++) {
            if (i < checkboxDecisionsInInteger.length) {
                int j = checkboxDecisionsInInteger[i] - k;
                tasks.remove(j);
                k++;
            }
        }

        System.out.println(tasks.size());
        session.setAttribute("tasks", tasks);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
