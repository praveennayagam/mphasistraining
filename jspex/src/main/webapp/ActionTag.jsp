<%@page import="jakarta.servlet.RequestDispatcher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action Tags</title>

</head>
<body>
	<jsp:useBean id="st" class="com.mph.Student" scope="request"></jsp:useBean>
	<jsp:setProperty property="sid" name="st" value="19" />
	<jsp:setProperty property="sname" name="st" value="Praveen" />

	<jsp:getProperty property="sid" name="st" />
	<jsp:getProperty property="sname" name="st" />

	<%
	out.println(" ***************************** ");
	%>
	<%pageContext.setAttribute("name", "Praveen");%>
	<br />
	<% request.setAttribute("id", "123");
	RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
	rd.forward(request, response);
	%>
	<% session.setAttribute("rollno", "19");%>
	<% application.setAttribute("num", "987654");
	%>
		${requestScope.st.sid } ${requestScope.st.sname }
</body>
</html>