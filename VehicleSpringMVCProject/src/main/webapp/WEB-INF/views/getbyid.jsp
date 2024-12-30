<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1 style="text-align: center; color: black; background-color: yellow;">...Vehicle Info by Id...</h1>
	<% Object o = request.getAttribute("infobyid");
	%>
	
	<h1><%= o %></h1>
</body>
</html>