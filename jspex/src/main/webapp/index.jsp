<%@page import="com.mph.Student"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="myerrorpage.jsp"%>
<%@include file="banner.html"%>

<!DOCTYPE html>
<html>
<body>
	<h2>Hello World!</h2>


	<%
	int x = 50;
	out.println("JSP " + x + "%");
	%>
	<%=new Date()%>
	<%--<%
	if (true) {
		throw new Exception();
	}
	--%>
	<form action="ActionTag.jsp" method="get">
		Student ID:<input type="text" name="stid" /> <br /> Student Name :<input
			type="text" name="sname" /><br /> <input type="submit" value="Submit" />
	</form>

	

</body>
</html>
