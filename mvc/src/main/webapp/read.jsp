<%@page import="com.app.vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 조회</title>
</head>
<body>
<%--    <%
      ProductVO product = (ProductVO)request.getAttribute("product");
   %>
   <div>
      <h1>상품명: <%=product.getProductName() %></h1>
      <p>상품가격: <%=product.getProductPrice() %></p>
      <p>상품재고: <%=product.getProductStock() %></p>
   </div>
   <div>
      <a href="/mvc/list.product">상품목록</a>
      <a href="/mvc/update.product?id=<%=product.getId()%>">상품수정</a>
      <a href="/mvc/delete-ok.product?id=<%=product.getId()%>">상품삭제</a>
   </div> --%>
   
   <div id="content">
      
   </div>
   <div>
      <a href="/mvc/list.product">상품목록</a>
      <a class="update-btn" href="/mvc/update.product?id=${product.id}">상품수정</a>
      <a class="delete-btn" href="/mvc/delete-ok.product?id=${product.id}">상품삭제</a>
   </div>
</body>
<script type="text/javascript">
   const product = JSON.parse(`${productJSON}`)
   const updateButton = document.querySelector(".update-btn")
   const deleteButton = document.querySelector(".delete-btn")
   const content = document.querySelector("#content")
   const {id, ...props} = product
   
/*    updateButton.href = "/mvc/update.product?id=" + product.id */
/*    deleteButton.href = "/mvc/delete-ok.product?id= + product.id */
      
   console.log(product)
   console.log(id)
   console.log(props)

/*    content.innerHTML += "상품 아이디:" + id
   
   for(let key in props){
      let title = "";
      if(key == "productName"){
         title = "제목: "
      }else if(key == "productPrice"){
         title = "가격: "
      }else if(key == "productStock"){
         title = "재고: "
      }
      content.innerHTML += "<p>" + title + props[key] + "</p>"
      console.log(props[key])
   } */
   
   content.innerHTML += (
      "<p>아이디: " + product.id + "</p>" +
      "<p>상품명: " + product.productName + "</p>" +
      "<p>가격: " + product.productPrice + "</p>" +
      "<p>재고: " + product.productStock + "</p>" 
   )
   
   
</script>
</html>