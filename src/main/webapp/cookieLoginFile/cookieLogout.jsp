<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "com.webapp.CookieBox" %>

<!DOCTYPE html> <!-- HTML 문서형식 -->
<%
	response.addCookie(CookieBox.createCookie("LOGIN", "", "/", 0));
	response.addCookie(CookieBox.createCookie("ID", "", "/", 0));
%>
<html>
<head>
<meta charset="UTF-8">
<title>cookieLogout.jsp</title>
</head>
<body>
	로그아웃하였습니다.
</body>
</html>