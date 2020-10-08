<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
  
   $(function() {
    $('#b1').click(function(){
    	$('#d1').empty()//기존에 있던거 지우기
    	 $.ajax({
    		 url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2",
    		 data: {
    			url: 'http://health.chosun.com/site/data/rss/rss.xml',
    			api_key: 'pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2',
    			count: 20
    		 },
    		 success: function(result){
    			 console.log('성공!!' + result)
    			 list = result.items
    			 console.log(list.length)
    			 if(list.length > 0){
    				 $(list).each(function(index, news){
    					 title= news.title
    					 pubDate = news.pubDate
    					 link = news.link
    					 console.log(title)
    					 console.log(pubDate)
    					 console.log(link)
    					 total = "<b><a href =" + link +">"+title+"</a>"  + "</b> : " + pubDate + "<br>" + link +"<br><hr>"
						$('#d1').append(total)	
    				 })//foreach
    			 }//if
    		 }//success
    	 })//ajax
     })//click
    
     
     $('#b2').click(function(){
    	 $('#d1').empty()
    	 $.ajax({
    		 url: " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Frss%2Fcolumn.xml&api_key=pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2",
    		 data: {
    			url: 'http://health.chosun.com/rss/column.xml',
    			api_key: 'pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2',
    			count: 20
    		 },
    		 success: function(result){
    			 console.log('성공!!' + result)
    			 list = result.items
    			 console.log(list.length)
    			 if(list.length > 0){
    				 $(list).each(function(index, news){
    					 title= news.title
    					 pubDate = news.pubDate
    					 link = news.link
    					 console.log(title)
    					 console.log(pubDate)
    					 console.log(link)
    					 total = "<b><a href =" + link +">"+title+"</a>"  + "</b> : " + pubDate + "<br>" + link +"<br><hr>"
						$('#d1').append(total)	
    				 })//foreach
    			 }//if
    		 }//success
    	 })//ajax
     })//click
     
     $('#b3').click(function(){
    	 $('#d1').empty()
    	 $.ajax({
    		 url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fart.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2",
    		 data: {
    			url: 'http://art.chosun.com/site/data/rss/rss.xml',
    			api_key: 'pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2',
    			count: 20
    		 },
    		 success: function(result){
    			 console.log('성공!!' + result)
    			 list = result.items
    			 console.log(list.length)
    			 if(list.length > 0){
    				 $(list).each(function(index, news){
    					 title= news.title
    					 pubDate = news.pubDate
    					 link = news.link
    					 console.log(title)
    					 console.log(pubDate)
    					 console.log(link)
    					 total = "<b><a href =" + link +">"+title+"</a>"  + "</b> : " + pubDate + "<br>" + link +"<br><hr>"
						$('#d1').append(total)	
				    
						$.ajax({
				         url: "db2.jsp",//db1.jsp로 연결
				         data: { //넘길 데이터
				            title : title,
				            pubDate : pubDate,
				            link : link
				         },
				         success: function(result) {//db1.jsp에서 성공적으로 처리했는지 확인여부
				            alert('db1.jsp를 통해서 db에 넣기!- 성공적으로 전송함.!!')
				            alert('db1.jsp의 결과: ' + result)
				         }
				      })
    				 })//foreach
    			 }//if
    		 }//success
    	 })//ajax
     })//click
   
   })
</script>
</head>
<body>
<button id= "b1">헬스조선</button>
<button id= "b2">건강컬럼</button>
<button id= "b3">아트조선</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>