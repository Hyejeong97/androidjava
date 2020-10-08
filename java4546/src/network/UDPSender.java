package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import org.apache.tomcat.jni.Socket;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();//괄호 안에 주소를 쓰지 않음, 알아서 가야함
		String str = "i am a android programmer!";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		socket.send(packet);
		socket.close();

	}

}
