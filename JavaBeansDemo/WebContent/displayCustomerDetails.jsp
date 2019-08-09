<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="cust" class="com.deloitte.cms.model.Customer" scope="session"></jsp:useBean>

<jsp:setProperty property="customerId" name="cust" param="customerid"/>
<jsp:setProperty property="customerName" name="cust" param="customerName"/>
<jsp:setProperty property="customerAddress" name="cust" param="customerAddress"/>
<jsp:setProperty property="billAmount" name="cust" param="billAmount"/>


<jsp:forward page="display.jsp"></jsp:forward>




</body>
</html>