<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("log_id");

	if(id !=null){
		session.invalidate();
		out.println("로그아웃되었습니다.");
	}else {
		out.println("이미로그아웃되었습니다.");
	}
	
%>


</body>
</html>