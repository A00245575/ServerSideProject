<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="main.css">
<title>Register</title>
</head>
<body id="font1">
<div class="topnav">
		<a href="login.jsp">Login</a>
		 <a href="Register.jsp">Register</a> 

	</div>
<h2>Welcome, Please Enter Your Details</h2>
<form method="post" action="RegisterServlet">
 Enter Name: <input type="text" name = "name">
 <br>
 Enter Password: <input type="password" name = "password"/>
 <br> 
 Enter Address:<input type="text" name = "address"/>
  <br>
 <input type="submit" value="Submit">
</form>
</body>
</html>