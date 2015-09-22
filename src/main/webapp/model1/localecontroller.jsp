<%@page import="java.util.Locale"%>
<%@page import="java.util.List"%>
<%@page import="com.webapp.service.LanguageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>localecontroller.jsp</title>
</head>
<body>
<h1>하하하</h1>
<h1>★★★</h1>
<h1>☆☆☆</h1>
<%

%>
<%
	LanguageService service = new LanguageService();
	List<Locale> locales = service.getLocales();
	
	// Scope 객체에 Model을 설정한다.
	// 1. pageContext
	// 2. request
	// 3. session
	// 4. application
	request.setAttribute("model", locales);
%>
<jsp:forward page="/WEB-INF/views/localeview.jsp"></jsp:forward>
</body>
</html>