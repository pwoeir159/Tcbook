<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tc商城</title>
</head>
<body>
	<table>
		<h2>登入畫面</h2>
		<form action="LoginServlet" method="post">
			<td><input type="text" name="username">帳號</td><tr>
			<td><input type="password" name="password">密碼</td><tr>
			<td><input type="submit" value="登入"></td>
		</form>
	</table>
</body>
</html>