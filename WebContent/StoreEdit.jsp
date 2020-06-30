<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<h1>歡迎管理者使用編輯系統</h1>
		
	</table>
	<table>
		<td><h2>新增商品</h2></td></tr>
		<form action="storeEditServlet" method="post">
			<input type="hidden" name="action" value="Add">
			<td>商品類別:<input name="commodityclass" type = "text"></td>
			<td>商品名稱:<input name="name" type = "text"></td>
			<td>商品價格:<input name="price" type = "text"></td>
			<td>商品數量:<input name="quantity" type = "text"></td>
			<td><input type = "submit"></td>
		</form>
	</table>
	
	<table>
		<td><h2>下架商品</h2></td></tr>
		<form action="storeEditServlet" method="post">
			<input type="hidden" name="action" value="Delete">
			<td>商品名稱:<input name="name" type = "text"></td>
			<td><input type = "submit"></td>
		</form>
	</table>
	
	<table>
		<td><h2>補充商品</h2></td></tr>
		<form action="storeEditServlet" method="post">
			<input type="hidden" name="action" value="ReplenishStock">
			<td>商品名稱:<input name="name" type = "text"></td>
			<td>商品數量:<input name="quantity" type = "text"></td>
			<td><input type = "submit"></td>
		</form>
	</table>
	
	<table>
		<td><a href="./searchProductServlet?action=list">返回商城首頁</a></td>		
	</table>
</body>
</html>