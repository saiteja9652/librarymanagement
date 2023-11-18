<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book search</title>
		<link rel="stylesheet" href="bookinfo.css">

</head>
<body>


		<h1>Book ISBN: ${Bookinfo.bookisbn}</h1>
		<h1>Book Name: ${Bookinfo.bookname}</h1>
		<h1>Book Author: ${Bookinfo.bookauthor}</h1>
		<h1>Book Price ${Bookinfo.bookprice}</h1>
		<button onclick="window.location.href='Home.html'">Home</button><br><br>

		<c:if test="${result==0}">
		<h1>No data available with your search try again..</h1>
		  <jsp:include page="Bookdelete.html"/>
		
	</c:if>
</body>
</html>