<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	out.println(pageContext.getAttribute("name"));
	%>
	<%
	out.println(request.getAttribute("id"));
	%>
	<%
	out.println(session.getAttribute("rollno"));
	%>
	<%
	out.println(application.getAttribute("num"));
	%>
</body>
</html>