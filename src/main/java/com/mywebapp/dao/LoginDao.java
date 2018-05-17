package com.mywebapp.dao;

import java.sql.*;

public class LoginDao {

    String sql = ("select * from members where uname=? and pass=?");

    public boolean checkCredentials(String uname, String pass) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyWebApp",
                    "postgres", "postgres");
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }
}
