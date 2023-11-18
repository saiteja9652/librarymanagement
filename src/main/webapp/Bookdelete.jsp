<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Delete</title>
		<link rel="stylesheet" href="bookinfo.css">

</head>
<body>
<c:if test="${result==1}">
		<h1>Book data deleted successfully....<%=request.getParameter("bookisbn") %></h1>
	</c:if>
	
	<c:if test="${result==0}">
  		<h1>Book data not available with given Book ISBN...<%=request.getParameter("bookisbn") %></h1>
	</c:if>
				<button onclick="window.location.href='Home.html'">Home</button><br><br>

</body>
</html>