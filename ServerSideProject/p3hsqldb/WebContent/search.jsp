<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="main.css">
<title>Add Hero</title>
</head>
<body id="font1">
<div class="topnav">
		<a href="login.jsp">Login</a>
		 <a href="Register.jsp">Register</a> 
		 <a href="addHero.jsp">Add Hero</a>
		 <a href="ShowHeroesServlet">Show Heroes</a>
		  <a href="addCreator.jsp">Add Creator</a> 
		  <a href="ShowCreatorsServlet">Show Creators</a> 
		  <a href="search.jsp">Search</a>

	</div>
	<br>
	<h2>Search for Hero</h2>
	<form method="post" action="SearchHeroServlet">
	<input type="text" name = "name">
	 <input type="submit" value="Submit">
 <br>
	</form>
	<h2>Search for Creator</h2>
	<form method="post" action="SearchCreatorServlet">
	 <input type="text" name = "name">
	 <input type="submit" value="Submit">
 <br>
	</form>
	<h2>Search for all Heroes by a Creator</h2>
	<form method="post" action="SearchHerosByCreatorServlet">
	 <input type="text" name = "name">
	 <input type="submit" value="Submit">
 <br>
	</form>

</body>
</html>