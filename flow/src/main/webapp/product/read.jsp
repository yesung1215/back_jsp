<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 조회</title>
</head>
<body>
	<div id="content">
   </div>
   
   <div id="link">
   </div>
</body>
<script type="text/javascript">
	const product = JSON.parse(`${productJSON}`);
	const link = document.querySelector("#link");
	console.log(product);
	
	content.innerHTML += (
			"<p>아이디: " + product.id + "</p>" +
			"<p>상품이름 : " + product.productName + "</p>" +
			"<p>상품가격 : " + product.productPrice + "</p>" +
			"<p>상품재고 : " + product.productStock + "</p>" 
			
	);
	
	link.innerHTML += (
		"<button><a href='/flow/list.product'>상품목록</a></button>" +
		"<button><a href='/flow/edit.product?id=" + product.id + "'>상품수정</a></button>" +
		"<button><a href='/flow/delete-ok.product?id=" + product.id + "'>상품삭제</a></button>" 
	);

</script>
</html>







