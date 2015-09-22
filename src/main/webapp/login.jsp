<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<%
	String log_id=request.getParameter("log_id");
	String log_pw=request.getParameter("log_pw");

	
	session.setAttribute("log_id", log_id);
	session.setAttribute("log_pw", log_pw);
%>
id : <%=session.getAttribute("log_id") %>
pw : <%=session.getAttribute("log_pw") %>
<br>
<a href ="logout.jsp">logout</a>

</body>
</html>