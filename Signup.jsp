<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="black" background="indexbg.jpeg" text="white"/>
<center>
<img src="imgprojlogo.png" height="100" width="100"/>
<h1>
Create Account
</h1>
<f:form action="/validateSignup" modelAttribute="user">
<table bgcolor="black" cellspacing="20" cellpadding="20" align="center">
<tr><td>Username</td><td><f:input type="text" path="userName" name="userName"/></td></tr>
<tr><td>Password</td><td><f:input type="password" path="password" name="password"/></td></tr>
<tr><td>ConfirmPassword</td><td><f:input path="confirmPassword" type="password" id="confirmPassword" name="confirmPassword"/></td></tr>
<tr><td></td><td><font color="red"> ${message1} </font></td></tr>
<tr><td><input type="submit" value="Create an TMDb account"/></td></tr>
<tr><td><h5>2019 Inc.</h5></td></tr>

${message}

</table>
</f:form>
</center>
</body>
</html>