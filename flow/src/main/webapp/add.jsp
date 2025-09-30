<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>
	<form action="/flow/add-ok.product" method="get">
		<div>
		 	<span>상품 이름</span>
         	<input name="productName" />
		</div>
			<span>상품 가격</span>
         	<input name="productPrice" />
		<div>
			<span>상품 재고</span>
         	<input name="productStock" />
		</div>
		<button>상품등록</button>		
	</form>
</body>
</html>