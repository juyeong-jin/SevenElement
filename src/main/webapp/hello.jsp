<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>hello.jsp</title>
</head>
<body>
<hr>
<%
	/*
	* Scriptlet
	*/
	for (int i=0; i<5; i++) {
		for(int j=0; j<3; j++) {
		out.println("<button>JSP</button>");
		
		}
		out.println("<br>");
	}
	out.println("<br>");
	out.println("현재시간 : " + new Date());
%>
<marquee behavior='alternate' scrollamount='50'><font size='7'>★</marquee> </font>
<hr>
loginid = <%= session.getAttribute("loginid") %>
<hr>
</body>
</html>