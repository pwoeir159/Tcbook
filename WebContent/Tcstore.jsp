<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>歡迎來到Tc商店</h1>
	<table>
		<h2>商品</h2>
		<form action="SearchProduct" method="post">
			<td>搜尋商品:<input type="text" name="keyword"></td><tr>
			<td><input type="submit" value="搜尋GO!"></td>
			<td><a href="./searchProduct?action=list">顯示所有商品</a></td>
		</form>
	</table>
	<table border="1">
	<h3>商品:</h3>
		<tr>
		<td>商品類別</td>
		<td>商品名稱</td>
		<td>商品價格</td>
		<td>剩餘數量</td>
		</tr>
		<tr>
			<c:forEach items = "${Slist}" var="i">	
			<tr>
				<td>${i.commodityclass}</td>
				<td>${i.name}</td>
				<td>${i.price}</td>
				<td>${i.quantity}</td>				
			</tr>
		</c:forEach> 			
		</tr>
	</table>
	
</body>
</html>