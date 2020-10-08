<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=발급받은 APP KEY를 넣으시면 됩니다."></script>
<script type="text/javascript">
  
   $(function() {
    $('#b1').click(function(){
    	$('#d1').empty()//기존에 있던거 지우기
    	 $.ajax({
    		 url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2",
    		 data: {
    			url: 'http://travel.chosun.com/site/data/rss/rss.xml',
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
    					 description = news.description
    					 
    					 console.log(title)
    					 console.log(pubDate)
    					 console.log(link)
    					 total = "<b><a href =" + link +">"+title+"</a>"  + "</b> : " + pubDate + "<br>" + link + description + "<br><hr>"
						$('#d1').append(total)	
    				 })//foreach
    			 }//if
    		 }//success
    	 })//ajax
    	 var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
    	 var options = { //지도를 생성할 때 필요한 기본 옵션
    	 	center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
    	 	level: 3 //지도의 레벨(확대, 축소 정도)
    	 };

    	 var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
     })//click
    
     
     $('#b2').click(function(){
    	 $('#d1').empty()
    	 $.ajax({
    		 url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_photo.xml&api_key=pu0wm6i2wmlmkh8bfq1cb9mwdfqg0rbmmvfzknj2",
    		 data: {
    			url: 'http://rss.hankyung.com/new/news_photo.xml',
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
     

   })
</script>
</head>
<body>
<button id= "b1">트래블조선</button>
<button id= "b2">포토</button>

<hr color="red">
<div id="d1"></div>

	<div id="map" style="width:500px;height:400px;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0d83259c940a3d4bd8bd4ac8dc6a450d"></script>
	<script>
		var container = document.getElementById('map');
		var options = {
			center: new kakao.maps.LatLng(37.5550417942246, 126.93604608489053),
			level: 3
		};

		var map = new kakao.maps.Map(container, options);
	</script>

</body>
</html>