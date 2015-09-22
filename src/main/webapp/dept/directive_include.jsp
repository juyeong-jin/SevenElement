<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>directive_include.jsp</title>
</head>
<body>
<%@  include file="/common/variable.jspf" %>

<ul>
	<li>context = <%=context %></li>
	<li>id = <%=request.getParameter("id") %></li>
	<li>pw = <%=request.getParameter("pw") %></li>
</ul>

<%@ include file="/common/copyright.jspf" %>

</body>
</html>