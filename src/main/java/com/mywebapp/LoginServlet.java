package com.mywebapp;

import com.mywebapp.dao.LoginDao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

    LoginDao dao = new LoginDao();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        if (dao.checkCredentials(uname, pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("name", uname);
            response.sendRedirect("UserPage.jsp");
        } else {
            response.sendRedirect("LoginPage.jsp");
        }
        out.close();

    }


}