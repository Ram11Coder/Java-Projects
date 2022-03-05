<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<%
		if (request.getAttribute("uname") == null)
		response.sendRedirect("LoginPage.jsp");
	%>

	<h2>Registration form</h2>
	<form action="/registrationSuccess.jsp">
		<b>Fill the form</b>
		
		Name : <input type="text"><br>
		Age : <input type="text"><br>
		DOB : <input type="text"><br>
		Occupation : <input type="text"><br>
		Years of experience : <input type="text"><br>
		Address : <input type="text"><br>
		
		Phone no : <input type="text"><br>
		Email : <input type="text"><br>
		
	</form>
	<!-- <input type="submit" value="All Employess">
 -->
	<a href="/AllEmployees">All Employees</a>

</body>
</html>