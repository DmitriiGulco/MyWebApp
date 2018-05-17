<%--
  Created by IntelliJ IDEA.
  User: dgulco
  Date: 15.05.2018
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<style>
    <%@include file="/WEB-INF/css/style.css"%>
</style>
<body>
<form action="Login" method="post">
    Name:<input type="text" name="uname"><br>
    Password:<input type="password" name="pass"><br>
    <input type="submit" value="login">

    <td colspan="2">You can <a href="RegistrationPage.jsp">register your account</a> here</td>

</form>

</body>
</html>
