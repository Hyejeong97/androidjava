package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient3 {
	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 10000; i++) {//10000번 반복
			Socket socket = new Socket("localhost", 9100);//localhost의 port가 9100인(ip, port) socket을 생성
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 들어오는 강물(stream)을 가지고 들어옴 =>파일
			// BufferedReader(2byte)이어야 string으로 인식할 수 있음
			// InputStreamReader =>다리역할(브릿지)
			// socket.getInputStream(1byte)=>파일이라서 다리역할(InputStreamReader)가 필요함

			String data = input.readLine();//한줄씩 읽어서 data에 저장
			System.out.println("받은 데이터: " + data);//출력
		}
		System.exit(0);// 시스템 종료
		System.out.println("client 서버와 연결됨.");
	}
}
