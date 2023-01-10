<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>"${msg}"</h2>
<form action="home">
<label>Username:-</label><br>
<input type="text" placeholder="Enter User Name" name="username"><br><br>
<label>Password:-</label><br>
<input type="password" name="password"  ><br><br>
<input type="submit" value="Login">
</form>
<h1>Registration</h1>
<form action="register">
<label>Username:-</label><br>
<input type="text" placeholder="Enter User Name" name="username"><br><br>
<label>Password:-</label><br>
<input type="password" name="password"  ><br><br>
<input type="submit" value="Register">
</form>
</body>
</html>