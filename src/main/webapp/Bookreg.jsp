<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Registration</title>
		<link rel="stylesheet" href="bookinfo.css">

</head>
<body>
<c:if test="${result==1}">
<h1>Book Registered successfully</h1>
				<button onclick="window.location.href='Home.html'">Home</button><br><br>

</c:if>

	<c:if test="${result==0}">
  		<h1>Book data not registered try again...</h1>
  <jsp:include page="bookreg.html"/>
	</c:if>

</body>
</html>