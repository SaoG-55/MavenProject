<%@ page import="com.Sg.model.data.ModelClass" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<%
		ModelClass md=(ModelClass)request.getAttribute("objmc");
		out.println(md);
		



%>

</body>
</html>