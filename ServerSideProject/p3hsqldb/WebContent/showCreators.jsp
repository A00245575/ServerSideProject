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
 <h1>Creators</h1>
<table id="customers">
<tr>
		<th>ID</th>
        <th>Name</th>
        <th>Founded By</th>
        <th>Year Founded</th>
        <th>Town Founded</th>
    </tr>
   <c:forEach items="${creators}" var="creator">
   <tr>
      <td><c:out value="${creator.id}" /></td>
      <td><c:out value="${creator.name}" /></td>
      <td><c:out value="${creator.foundedBy}" /></td>
      <td><c:out value="${creator.yearFounded}" /></td>
      <td><c:out value="${creator.town}" /></td>
      </tr>
   </c:forEach>
   </table>
</body>
</html>