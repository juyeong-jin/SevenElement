<%@page import="java.util.Locale"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>localeview.jsp</title>
</head>
<body>
<hr>
<h1>Locale View</h1>
<hr>
<ol>
<%
	List<Locale> model = (List<Locale>)request.getAttribute("model");
	
	if (model !=null)
	for (Locale l : model) {
%>
	<li>
	<%=l.getDisplayName() + " " + l.getLanguage() + "_" + l.getCountry()%>
	</li>
<% 
	}
%>
</ol>
</body>
</html>