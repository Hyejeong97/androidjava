<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
   //콜백함수(call-back함수)
   //특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
   //함수가 정의되어있는 곳으로 돌아가 자동 호출되는 함수
   //body의 하위 엘리먼트(태그)를 
   //먼저 브라우저가 dom-tree를 구성한 후
   //콜백함수를 정의하게 되어있음.
   //브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
   //body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
   $(function() {
      $('#b1').click(function() {//버튼 클릭 함수
         $.ajax({//비동기통신
            url: "data/member.xml",//member.xml파일로 ajax통신
            success: function(doc) {//연결 성공시 실행
               console.log('XML요청 성공!!')
               console.log('XML결과: ' + doc)// 연결받은 문서
               list = $(doc).find('record')//문서에서 record를 찾아서 list에 저장
               console.log('레코드의 개수: ' + list.length)//list 개수 출력
               if(list.length > 0){//list 개수가 초과이면 실행
                  $(list).each(function(index, item) {//foreach로 출력
                     id = $(item).find('id').text()//item에서 id의 text를 찾아서 id에 저장
                     first_name = $(item).find('first_name').text()
                     last_name = $(item).find('last_name').text()
                     email = $(item).find('email').text()
                     gender = $(item).find('gender').text()
                     ip_address = $(item).find('ip_address').text()
                     total = 'id: ' + id + 
                        ', first_name: ' + first_name +
                        ', last_name: ' + last_name +
                        ', email: ' + email +
                        ', gender: ' + gender +
                        ', ip_address: ' + ip_address // 저장한 값들을 total에 저장
                     console.log(total)//total 출력
                     $('#d1').append(total + '<br>')//브라우저에 출력
                     
                     $.ajax({
                        url: "db1.jsp",//db1.jsp로 연결
                        data: { //넘길 데이터
                           id : id,
                           first_name : first_name,
                           last_name : last_name,
                           email : email,
                           gender : gender,
                           ip_address : ip_address
                        },
                        success: function(result) {//db1.jsp에서 성공적으로 처리했는지 확인여부
                           alert('db1.jsp를 통해서 db에 넣기!- 성공적으로 전송함.!!')
                           alert('db1.jsp의 결과: ' + result)
                        }
                     })
                  })
               }
            }
         })
      })
      $('#b2').click(function() {
         $.ajax({
            url: "data/member.json",
            success: function(doc) {
               //alert('JSON요청 성공!!')
            	console.log(doc)
            	$(doc).each(function(index, item){
            		id = item.id
                    first_name = item.first_name
                    last_name = item.last_name
                    email = item.email
                    gender = item.gender
                    ip_address = item.ip_address
                    
                    total = 'id: ' + id + 
                    ', first_name: ' + first_name +
                    ', last_name: ' + last_name +
                    ', email: ' + email +
                    ', gender: ' + gender +
                    ', ip_address: ' + ip_address
                    
                    console.log(total)
                    $('#d1').append(total + '<br>')
            	})//each
            }//success
         })
      })
      $('#b3').click(function() {
         
      })
   })
</script>
</head>
<body>
<button id= "b1">XML읽어오기</button>
<button id= "b2">JSON읽어오기</button>
<button id= "b3">DB에 넣기</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>