package com.mokujin.module08;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ToDoListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String title = "Using " + request.getMethod() + " Method to read form data";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        out.println(docType + "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "<h1>\n" +
                "<ul>\n" +
                "<li><b>Task Name</b>: " + request.getParameter("task_name") + "\n" +
                "<li><b>Task Category</b>: " + request.getParameter("task_category") + "\n" +
                "</ul>\n" + "</body></html>");
    }
}















