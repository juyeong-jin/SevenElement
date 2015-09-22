<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html> <!-- HTML 문서형식 -->
<html>
<head>
<meta charset="UTF-8">
<title>layout.jsp</title>
</head>
<body>
	
<header style="border:1px solid red;">
	<h1>header</h1>
	<jsp:include page="/layout/header.jsp"></jsp:include>
</header>  

<section style="border:1px dotted black; overflow: hidden;">
	<aside style="border:1px solid red; float: left; width: 200px">
		<h1>aside</h1>
	</aside>
	<article  style="border:1px solid red; float: left; width: 500px">
		<h1>article</h1>
	</article>
</section>

<footer style="border:1px solid blue;">
<jsp:include page="/layout/footer.jsp"></jsp:include>
	<h1>footer</h1>
</footer>

</body>
</html>