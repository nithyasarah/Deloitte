<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="indexbg.jpeg" text="white">



<center>
<br/>
<br/>
<f:form action="/signin">
<div align="right"><input type="submit" value="Logout" />
<font color="white"></font>
</div>
<img src="imgprojlogo.png" height="100" width="100">
<br>

</f:form>
<table bgcolor="black" cellspacing="15" cellpadding="15" align="center">
<tr><td><font color="white">Welcome, <%= session.getAttribute("u") %></font> </td></tr>
</table>

<img src="1.png">
<%-- 
<p align="right">
<table bgcolor="black" cellspacing="15" cellpadding="15" align="center">
<tr><td>Welcome, <%=session.getAttribute("U") %></td></tr>
</table>
</p> --%>





<f:form action="/Movie" modelAttribute="movie">
<table bgcolor="black" cellspacing="15" cellpadding="15" align="center">
<tr><td>Movie Name</td><td><f:input type="text" path="movieName" name="movieName"/></td></tr>
<tr><td><input type="submit" value="Search!"/></td></tr>
</table>
</f:form>

<img src="2.png">
 <f:form name="f1" action="/Director">
 <table bgcolor="black" cellspacing="15" cellpadding="15" align="center"> 
<tr><td><label>SearchBy:</label>
 <select name="director" id="s" >
      <option value="Steven Spielberg">Steven Spielberg</option>      
       <option value="Martin Scorsese">Martin Scorsese</option>  
	   <Option value="David Fincher">David Fincher</option>
	   <Option value="Quentin Tarantino">Quentin Tarantino</option>
	   <Option value="Christopher Nolan">Christopher Nolan</option>
     </select></td></tr>
<tr><td> <input type="submit" value="Search by Director!"></td></tr>
 </table>
</f:form>

<img src="3.png">
 <f:form name="f2" action="/Year">
 <table bgcolor="black" cellspacing="15" cellpadding="15" align="center"> 
<tr><td><label>SearchBy:</label>
 <select name="year" id="s" >
      <option value="1980">1980</option>      
       <option value="1981">1981</option>  
	   <Option value="1982">1982</option>
	   <Option value="1983">1983</option>
	   <Option value="1984">1984</option>
	   <Option value="1985">1985</option>
	   <Option value="1986">1986</option>
	   <Option value="1987">1987</option>
	   <Option value="1988">1988</option>
	   <Option value="1989">1989</option>
	   <Option value="1990">1990</option>
	   <Option value="1991">1991</option>
	   <Option value="1992">1992</option>
	   <Option value="1993">1993</option>
	   <Option value="1994">1994</option>
	   <Option value="1995">1995</option>
	   <Option value="1996">1996</option>
	   <Option value="1997">1997</option>
	   <Option value="1998">1998</option>
	   <Option value="1999">1999</option>
	   <Option value="2000">2000</option>
	   <Option value="2001">2001</option>
	   <Option value="2002">2002</option>
	   <Option value="2003">2003</option>
	   <Option value="2004">2004</option>
	   <Option value="2005">2005</option>
	   <Option value="2006">2006</option>
	   <Option value="2007">2007</option>
	   <Option value="2008">2008</option>
	  <Option value="2009">2009</option>
	 <Option value="2010">2010</option>
	 <Option value="2011">2011</option>
	 <Option value="2012">2012</option>
	 <Option value="2013">2013</option>
	 <Option value="2014">2014</option>
	 <Option value="2015">2015</option>
	 <Option value="2016">2016</option>
	 <Option value="2017">2017</option>
	 <Option value="2018">2018</option>
	 <Option value="2019">2019</option>	   
     </select></td></tr>
<tr><td> <input type="submit" value="Search!"></td></tr>
 </table>
</f:form>


<img src="4.png">
 <f:form name="f1" action="/Genre">
 <table bgcolor="black" cellspacing="15" cellpadding="15" align="center"> 
<tr><td><label>SearchBy:</label>
 <select name="genre" id="s" >
      <option value="Action">Action</option>      
       <option value="Comedy">Comedy</option>  
	   <Option value="Drama">Drama</option>
	   <Option value="Horror">Horror</option>
	   <Option value="Thriller">Thriller</option>
     </select></td></tr>
<tr><td> <input type="submit" value="Search by Genre!"></td></tr>
 </table>
</f:form>

</center>
</body>
</html>