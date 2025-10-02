<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<table id="list-table">
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>판매자</th>
		</tr>
		
	</table>
</body>
<script type="text/javascript">
const product = JSON.parse(`${productJSON}`)
console.log(product)
const listTable = document.querySelect("list-table");


</script>

</html>