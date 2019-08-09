<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=request.getParameter("username");
String password=request.getParameter("password");
if(username.equals("nithya") && (password.equals("nithya")))
{%>

<jsp:forward page="success1.jsp"></jsp:forward>
		<%
}

else
{
	session.setAttribute("errMsg", "Incorrect Username or Password");
	response.sendRedirect("login.jsp");
}
		%>





</body>
</html>