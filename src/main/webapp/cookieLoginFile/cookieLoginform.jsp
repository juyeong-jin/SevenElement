<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>cookieLoginform.jsp</title>
</head>
<body bgcolor="lightgreen" topmargin="100">
<table width="75%" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#660000" bgcolor="FFFF99">
<tr bordercolor="#FFFF99">
<td height="190" colspan="7">
<form action="cookieLogin.jsp" method="get">
<table width="50%" border="1" align="center" cellspacing="0" cellpadding="0">
<tr bordercolor="#FFFF66">
	<td clospan="2"><div align="center">Log In</div></td>
	</tr>
	<tr>
		<td width="47%"><div align="center">id</div></td>
		<td width="53%"><div align="center">
			<input type="text" name="id">
			</div></td>
			</tr>
	<tr>
	<td><div align="center">Password</div></td>
	<td><div align="center">
		<input type="password" name="pw">
	</div></td>
	</tr>
	
	<tr>
		<td colspan="2"><div align="center">
		<input type="submit" value="login">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="reset">
		</div></td>
		</tr>
		</table>		
</form></td>
</tr>
</table>
</body>
</html>