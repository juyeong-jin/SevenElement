<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "com.webapp.CookieBox" %>

<!DOCTYPE html> <!-- HTML 문서형식 -->
<%
	CookieBox cookieBox = new CookieBox(request);
	boolean login = cookieBox.exists("LOGIN") && cookieBox.getValue("LOGIN").equals("SUCCESS");
%>
<html>
<head><title>cookieLoginCheck.jsp</title></head>
<body>
<%
	if(login){
%>
아이디 "<%=cookieBox.getValue("ID") %>"로 로그인 한 상태
<%
	}else{
%>
로그인하지 않은 상태
<%
	}
%>
</body>
</html>	