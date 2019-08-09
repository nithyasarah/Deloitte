<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Search Customer Id</h2>
<f:form action="searchCustomerById.do">

<table bgcolour="white"  cellspacing="10" cellpaddng= "10" align= "center">
<tr><td>  Customer ID:   </td><td><f:input type = "text" path="customerId" id= "customerId" name="customerId"></f:input></td></tr></br>
<tr><td> <input type = "submit" value="Search"></td><td><input type = "reset" value="Clear"></td>
<tr><td>  Customer Name:   </td><td><f:input type = "text" path="customerName" id= "customerName" name="customerName"></f:input></td></tr></br>
<tr><td> Customer Address:   </td><td>
<f:input path="customerAddress" type="text" id= "customerAddress" name="customerAddress"></f:input></td></tr></br>
<tr><td> AMOUNT:   </td><td><f:input type = "text" path="billAmount" id= "billAmount" name="billAmount"></f:input></td></tr></br>

</tr></br>





</table>
</f:form>


<a href="CustomerApp.html"> Home </a>
</body>
</html>