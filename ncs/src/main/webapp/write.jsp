<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<body>
	<form action="/ncs/write-ok.product">
		<div>
			<span>상품명: </span><input name="ncsProductName" />
		</div>
		<div>
			<span>가격: </span><input name="ncsProductPrice" />
		</div>
		<div>
			<span>판매자: </span><input name="ncsProductSeller" />
		</div>
		<button>상품 등록</button>
	</form>
</body>
</html>