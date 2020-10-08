package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//1. 연결 요청만 담당하는 서버용 socket 필요
		//prototype(프로토타입) 방법 <-> singletone(싱글톤)
		//필요할때마다 객체 생성 <-> 하나만 객체 생성 주소를 재사용
		
		ServerSocket server = new ServerSocket(9100);//port주소가 9100인 server 생성
		System.out.println("TCP 서버 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중..");//server생성이 잘 됐으면 출력
		
		int count = 0;//초기화
		while (true) {//반복
			Socket socket = server.accept();//accept는 기다리다가 서버오면 승인
			count++;//서버접속할 때마다 +1
			System.out.println(count + "번 클라이언트와 연결");//출력
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);//파일을 가져와서 out에 저장
			//파일, 소켓 등 나갈 수 있는 경로가 다양함
			out.println("i am a java programmer!!!");
		}
		
	}

}
