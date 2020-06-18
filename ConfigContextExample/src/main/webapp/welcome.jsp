<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<p>Hello</p>
	<form action="ServletOne" method="get">
		<label>Click here for Servlet One:</label>
		<button class="btn btn-success" type="submit">Click me</button>
	</form>
	<form action="ServletTwo" method="get">
		<label>Click here for Servlet Two: </label>
		<button class="btn btn-success" type="submit">Click me</button>
	</form>
</body>
</html>