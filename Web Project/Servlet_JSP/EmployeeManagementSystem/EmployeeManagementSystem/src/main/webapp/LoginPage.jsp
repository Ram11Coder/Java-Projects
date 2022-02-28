<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Login Form</h2><br><br>
<div class="login">
<form id="login" action="login" method="get">
<label><b>UserName</b></label>
<input type="text" id="uname" name="Uname"><br><br>
<label><b>Password</b></label>
<input type="text" id="pass" name="pass"><br><br>
<input type="submit" id="log" name="log" value="Login"><br><br>
<input type="checkbox" id="check">
<span>Remember me</span>
<br>
<br>
Forget <a href="#">Password</a>

</form>
</div>
</body>
</html>