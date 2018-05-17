<%--
  Created by IntelliJ IDEA.
  User: dgulco
  Date: 15.05.2018
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>
</head>
<style>
    <%@include file="/WEB-INF/css/style.css"%>
</style>
<body>
<form method="post" action="registration">
    <div style="text-align: center;">
        <table border="1" width="30%" cellpadding="5">
            <thead>
            <tr>
                <th colspan="2">Enter Information Here</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="fname" value=""/></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="lname" value=""/></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value=""/></td>
            </tr>
            <tr>
                <td>User Name</td>
                <td><input type="text" name="uname" value=""/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" value=""/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
                <td><input type="reset" value="Reset"/></td>
            </tr>
            <tr>
                <td colspan="2">Already registered!! <a href="LoginPage.jsp">Login Here</a></td>
            </tr>
            </tbody>
        </table>
    </div>
</form>
</body>
</html>
