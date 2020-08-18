package 기본입출력;

import javax.swing.JOptionPane;

public class 입력2개2 {

	public static void main(String[] args) {
		
		//2) 숫자 입력을 2개 받아서 시작값 5, 종료값 1000이면 5~1000까지 프린트
		
		
		
		String start = JOptionPane.showInputDialog("시작값을 입력하세요");
		String end = JOptionPane.showInputDialog("종료값을 입력하세요");
		
		int s = Integer.parseInt(start);
		int e = Integer.parseInt(end);
		
		
			for(int i=s; i<=e; i++) {
				System.out.println(i);
			}
		

	}

}
