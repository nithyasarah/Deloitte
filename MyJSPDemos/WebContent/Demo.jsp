<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Deloitte
<% 
for(int i=0;i<5;++i)
out.println("<br/>Jaya");

%>

<% 
for(int i=0;i<5;++i)
{%>
<h2>Nithya  </h2>
<%} %>



<% 
int marks=90;
if (marks>90)
{%>
<font color=red> TRY AGAIN</font>
<%}
else{%>
<font color=green> CONGRATS</font>
<%}%> 

<h1>
your Marks: <% out.println(marks); %>
</h1>

<h1>
your Marks: <%=marks %>

</h1>
</body>
</html>