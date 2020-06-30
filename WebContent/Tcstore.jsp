<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TCstore</title>
</head>
<body>	
	<h1>歡迎來到Tc商店</h1>
	
	<table >		
		<form action="searchProductServlet" method="post">
			<td>搜尋商品:<input type="text" name="keyword"> <input type="submit" value="搜尋GO!"></td><tr>
			
		    
	<!--  <td style="position:fixed; left:570px; top: 180px; "><a href="./searchProduct?action=add">新增商品</a></td>
			<td style="position:fixed; left:570px; top: 220px; "><a href="./searchProduct?action=list">刪除商品</a></td>
			<td style="position:fixed; left:570px; top: 260px; "><a href="./searchProduct?action=list">更改商品</a></td> -->
		
		</form>
	</table>
	
	<table>
		<td><a href="./searchProductServlet?action=list">顯示所有商品</a></td>
		<td><a href="./StoreEdit.jsp">後台管理</a></td>
	</table>

	<table>
		<form action="./stroreTransactionServlet" method="post">
		<input type="hidden" name="action" value="buy" >
		<td>購買商品:<input name="name" type="text"></td>
		<td>購買數量:<input name="quantity" type="text"></td>
		<td><input type="submit"></td>
		</form>
	</table>
		
	<table border="1" >
	<h3>商品</h3>
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