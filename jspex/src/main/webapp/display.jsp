<%@page import="com.mph.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
</head>
<body>

	<%! Student st = new Student();%>
	<%
	int stdid = Integer.parseInt(request.getParameter("stid"));
	String sname = request.getParameter("sname");
	st.setSid(stdid);
	st.setSname(sname);
	
	%>
		<%=st.getSid()%>
	<%=st.getSname()%>
</body>
</html>