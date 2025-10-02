<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더</title>
</head>
<body>
	<c:if test="${empty memberEmail}">
		<div>
			<a href="/flow/join.member">회원가입</a>	
			<a href="/flow/login.member">로그인</a>
		</div>
	</c:if>
	<c:if test="${not empty memberEmail}">
		<div>
			<a href="/flow/add.product">상품등록</a>
			<a href="/flow/list.product">상품리스트</a>
			<a href="/flow/list.order">주문내역</a>
			<a href="/flow/logout-ok.member">로그아웃</a>
		</div>
	</c:if>
</body>
</html>




