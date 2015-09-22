<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "com.webapp.CookieBox" %>

<!DOCTYPE html> <!-- HTML 문서형식 -->
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals(pw)){
		response.addCookie(CookieBox.createCookie("LOGIN","SUCCESS","/",-1));
		response.addCookie(CookieBox.createCookie("ID",id,"/",-1));
%>
<html>		
<head>
<meta charset="UTF-8">
<title>cookieLogin.jsp</title>
</head>
<body>
로그인에 성공!!
<form action="cookieLogout.jsp">
<input type="submit" value="logout">
</form>
</body>
</html>
<%
	}else {
%>
<script>

alert("로그인 실패");
history.go(-1);

</script>
<%
	}
%>