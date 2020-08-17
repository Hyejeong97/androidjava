package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 두 수를 입력받아서
		//int로 변환 후
		//더한 다음
		//더한 결과값 출력 
		
		//ctrl + alt + 화살표아래: 한 줄 복사
		//alt + 화살표방향 : 이동
		
		String firstNum = JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요.");
		String secondNum = JOptionPane.showInputDialog("두 번째 숫자를 입력하세요.");
		
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secondNum);
		
		int plus = num1 + num2;
		//+연산자 :cpu
		
		System.out.println("정답은 : " + plus);
		

	}

}
