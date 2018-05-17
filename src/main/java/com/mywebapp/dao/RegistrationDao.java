package com.mywebapp.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationDao {

    public void registerUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {

        String user = request.getParameter("uname");
        String pwd = request.getParameter("pass");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String sql = ("insert into members(first_name, last_name, email, uname, pass, regdate) values ('" + fname + "','" + lname + "','" + email + "','" + user + "','" + pwd + "', current_date)");


        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyWebApp",
                "postgres", "postgres");
        Statement st = con.createStatement();
        //ResultSet rs;
        int i = st.executeUpdate(sql);
        if (i > 0) {
            response.sendRedirect("WelcomePage.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }

}
