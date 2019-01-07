<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="main.css">
<title>Heroes</title>
</head>
<body>
<div class="topnav">
		<a href="login.jsp">Login</a>
		 <a href="Register.jsp">Register</a> 
		 <a href="addHero.jsp">Add Hero</a>
		 <a href="ShowHeroesServlet">Show Heroes</a>
		  <a href="addCreator.jsp">Add Creator</a> 
		  <a href="ShowCreatorsServlet">Show Creators</a> 
		  <a href="search.jsp">Search</a>

	</div>
 <h1>Heroes</h1>
<table id="customers">
<tr>
		<th>Hero ID</th>
        <th>Name</th>
        <th>Alias</th>
        <th>Hometown</th>
        <th>Weapon</th>
        <th>Creator ID</th>
        <th>Creator</th>
        <th>Founded By</th>
        <th>Year</th>
    </tr>
   <c:forEach items="${heroes}" var="hero">
   <tr>
      <td><c:out value="${hero.heroID}" /></td>
      <td><c:out value="${hero.name}" /></td>
      <td><c:out value="${hero.alias}" /></td>
      <td><c:out value="${hero.hometown}" /></td>
      <td><c:out value="${hero.weapon}" /></td>
      <td><c:out value="${hero.creatorID}" /></td>
      <td><c:out value="${hero.creator}" /></td>
      <td><c:out value="${hero.foundedBy}" /></td>
      <td><c:out value="${hero.yearFounded}" /></td>
      </tr>
   </c:forEach>
   </table>
</body>
</html>