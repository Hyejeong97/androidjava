package 기본입출력;

import javax.swing.JOptionPane;

public class 입력2개1 {
	public static void main(String[] args) {
		
		//1) 2개의 숫자를 입력받아서 사칙연산
		
		
		String num1 = JOptionPane.showInputDialog("숫자1을 입력하세요");
		String num2 = JOptionPane.showInputDialog("숫자2를 입력하세요");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
	}
}
