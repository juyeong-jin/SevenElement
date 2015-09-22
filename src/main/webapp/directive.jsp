<%@page import="org.apache.commons.logging.Log"%>
<%@page import="org.apache.commons.logging.LogFactory"%>
<%@ page contentType = "text/html; charset=utf-8" %>  
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8"/>
	<title>directive.html</title>
</head>
<%
	request.setCharacterEncoding("utf-8");
%>
<hr>
<%	
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	
	log("id = " + id);
	log("name = " + name);
	
	log.info("id = " + id);
	log.info("name = " + name);
%>

<body>
<button>GET</button>
<button>POST</button>
<button>PUT</button>
<button>DELETE</button>
<div>
	Response Result 홍길동
	<h1> id = <%=id %></h1>
	<h1> name = <%=name %></h1>
	<h1> 1999 + 23456 = <%=add(1999, 23456) %> </h1>
</div>

<%!
	static Log log = LogFactory.getLog("directive.jsp");
	String msg = "Declaration...";
	int add(int a, int b){
		return a + b;
	}

%>
</body>
</html>