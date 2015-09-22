<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>sessionread.jsp</title>
</head>
<body>
<%
	Date d = new Date();
	d.setTime(session.getCreationTime());
%>
<hr>
JSESSIONID = <%=session.getId() %><br>
MaxInactiveInterval = <%=session.getMaxInactiveInterval() %><br>
CreationTime = <%=d.toLocaleString() %><br>
loginid = <%= session.getAttribute("loginid") %><br>
<hr>
</body>
</html>