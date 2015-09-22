<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>

<!-- 
<%
				// String context = application.getContextPath();

				/* 	String xxx = "abcd\uaaaa xxx\""; 	// abcd"xxx"
					char c = '\''; */
%>
-->


<%@ include file ="/common/variable.jspf" %>
<ul>	
	<li><a href="hello.jsp">hello.jsp</a></li>
	<li><a href="directive.jsp">directive.jsp</a></li>
	<li><a href="params.jsp?xxx=홍길동&yyy=이순신">params.jsp</a></li>
	<li><a href="form.jsp">form.jsp</a></li>
	<li><a href="/SevenElement/RedirectServlet">RedirectServlet</a></li>
	<li><a href="<%=context%>/redirect.jsp">redirect.jsp</a></li>	
	<li><a href="<%=context%>/model1/localecontroller.jsp">Locale MVC model 1</a></li>	
	<li><a href="<%=context%>/locales">Locale MVC model 2</a></li>	
	<li><a href="<%=context%>/model1/timezonecontroller.jsp">TimeZone MVC model 1</a></li>	
	<li><a href="<%=context%>/timezones">TimeZone MVC model 2</a></li>	
	<li><a href="<%=context%>/directive_include.jsp">&lt;%@&nbsp;&nbsp; include&gt;</a></li>	
	<li><a href="<%=context%>/layout.jsp">&lt;jsp:includ e&gt;</a></li>	
	<li><a href="<%=context%>/cookiecreate">cookie create</a></li>	
	<li><a href="<%=context%>/cookie/cookieread">cookie read</a></li>
	<li><a href="<%=context%>/cookie/cookiedelete">cookie delete</a></li>
	<li><a href="<%=context%>/sessioncreate">session create</a></li>
	<li><a href="<%=context%>/session/sessionread">session read</a></li>
	<li><a href="<%=context%>/session/sessiondelete">session delete</a></li>
	
</ul>
<hr>
<ol>
	<li><a href="hello.jsp">hello.jsp</a></li>
	<li><a href="directive.jsp">directive.jsp</a></li>
	<li><a href="params.jsp?xxx=홍길동&yyy=이순신">params.jsp</a></li>
	<li><a href="form.jsp">form.jsp</a></li>
	
</ol>

</body>
</html>