<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>

<script type="text/javascript">
$(function() {
	$('#bu').click(function() {
		//alert("환영합니다!");
	})
	
	$('#b1').click(function() {
		replyValue = $('#reply').val()
		$.ajax({
			url: "reply.do",
			data: {
				reply: replyValue
			},
			success: function(result) {
				//alert(result)
				$('#d1').append(result);
			}
		})
	})
	
	$('#b2').click(function() {
		idValue = $('#id').val()
		$.ajax({
			url: "check.do",
			data: {
				id : idValue
			},
			success: function(result2) {
				$('#d2').html(result2);
			}
		})
	})
});
</script>

</head>
<body>
<h3>좋아하는 영화를 검색하세요!</h3>
<hr>
	<form action="movie.do">
		영화제목 <input type="text" name="title">
		관람료 <input type="text" name="price">
		<button id="bu" type="submit">제출</button>
	</form>
	
	<hr>

	가입할 id 입력: <input type="text" id="id">
	<button id="b2">제출</button>
	<div id="d2"></div>
	<hr>
	
	댓글: <input type="text" id="reply">
	<button id="b1">댓글달기</button>
	<hr>
	<div id="d1"></div>

</body>
</html>