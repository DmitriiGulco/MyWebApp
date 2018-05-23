package com.mywebapp;

import com.mywebapp.dao.RegistrationDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/registration")
public class UserControllerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession(true);

        String lastName = request.getParameter("fname");
        String firstName = request.getParameter("lname");
        String email = request.getParameter("email");
        String userName = request.getParameter("uname");
        String password = request.getParameter("pass");


        try {
            RegistrationDao registrationDao = new RegistrationDao();
            registrationDao.registerUser(firstName, lastName, email, userName, password);
            response.sendRedirect("WelcomePage.jsp");
        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
