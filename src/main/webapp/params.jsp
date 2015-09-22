<%@page import="java.util.Set"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.commons.logging.Log"%>
<%@page import="org.apache.commons.logging.LogFactory"%>
<%@ page contentType = "text/html; charset=utf-8" %>  
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8"/>
	<title>params.html</title>
</head>
<%
	request.setCharacterEncoding("utf-8");
%>

<body>

<div>

<% 
	Map<String, String[]> params = request.getParameterMap();
	Set<Entry<String, String[]>> setparam = params.entrySet();
	
	for(Entry<String, String[]> entry : setparam){
		String pname = entry.getKey();
		String[] pvalue = entry.getValue();
		out.println(pname + " = ");
		
		if(pvalue != null)
		for(String value : pvalue){
			out.print(value + " ");
		}
		out.println("<br>");
	}
%>
</div>
</body>
</html>