<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정</title>
</head>
<body>
	<input type="hidden value=${product.id} " />
	<div>
		<span>상품명: </span><input name="ncsProductName" value=${product.ncsProductName}; />
	</div>
	<div>
		<span>가격: </span><input name="ncsProductPrice" value=${product.ncsProductPrice}; />
	</div>
	<div>
		<span>판매자: </span><input name="ncsProductSeller" value=${product.ncsProductSeller}; />
	</div>
	<button>상품 등록</button>

</body>
</html>