package com.mywebapp;

import com.mywebapp.dao.RegistrationDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    RegistrationDao dao = new RegistrationDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
            dao.registerUser(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
