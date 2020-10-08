<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>마커 생성하기</title>
    
</head>
<body>
<div id="map" style="width:500px;height:350px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0d83259c940a3d4bd8bd4ac8dc6a450d"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.5550417942246, 126.93604608489053), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 마커가 표시될 위치입니다 
var markerPosition1  = new kakao.maps.LatLng(37.5550417942246, 126.93604608489053); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});


// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);


// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
// marker.setMap(null);    
</script>
</body>
</html>