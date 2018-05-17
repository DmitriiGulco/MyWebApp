package com.mywebapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/visitors")
public class VisitCounter extends HttpServlet {
    int i = 1;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        service(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        service(request, response);
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("visitors", i++);
        request.getRequestDispatcher("Visitors.jsp").forward(request, response);

    }

}