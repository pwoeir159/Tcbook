<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<div>登入成功</div>
	<form action="./searchProductServlet" method="get">
	<input type="hidden" name="action" value="list">
	<input type="submit">
	</form>
</body>
</html>