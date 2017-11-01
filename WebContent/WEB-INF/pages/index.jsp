<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentApp::login</title>
</head>
<body>
	<h1>Student Application</h1>
	<form method="post" action="login">
	<p>${status}</p>
		<h3>login here!</h3><br>
		<label for="username" >User Name:</label><input type="text" name="username" /><br />
		<label for="password" > Password:</label><input	type="password" name="password" /><br /> 
		<input type="submit" value="login" />
	</form>
</body>
</html>