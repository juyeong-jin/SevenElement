<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
<form action="lifecycle" method="post">
	<label>id : 
		<input type="text" name="id"/> 
	</label> <br>
	
	<label>pw : 
		<input type="password" name="pw"/> 
	</label> <br>
	
	<label>jsp
		<input type="checkbox" name="lang" value="jsp"/>
	</label>
	<label>spring
		<input type="checkbox" name="lang" value="spring"/>
	</label>
	<label>android
		<input type="checkbox" name="lang" value="android"/>
	</label><br>
	
	<label>남자
		<input type="radio" name="sex" value="male"/>
	</label>
	<label>여자
		<input type="radio" name="sex" value="female"/>
	</label><br>
	
	<input type = "submit"/>

</form>
</body>
</html>