<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<form action="/mvc_task/write-ok.post" method="get">
		<div>
			<span>게시글 제목</span><input name="postTitle"  />	
		</div>
		<div>
			<br>
		</div>
		<div>
			<span>게시글 내용</span><input name="postContent" maxlength="500" placeholder="최대 500자" style="width:300px; height:150px;" />	
		</div>
		<button type="button">게시글 등록</button>
	</form>
</body>
<script type="text/javascript">
	const form = document.querySelector("form");
	const inputs = document.querySelector("input");
	const button = document.querySelector("button");
	
	button.addEventListener("click", (e) => {
		inputs.forEach((input) => {
			if(!input.value){
				alert(input.name + "의 값이 없습니다.")
			}
		})
	})

</script>
</html>