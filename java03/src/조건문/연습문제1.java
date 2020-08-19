package 조건문;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("숫자1을 입력하세요"));
		// 숫자1을 입력받아서 정수로 변환한 뒤 num1값에 저장
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("숫자2를 입력하세요"));
		// 숫자2를 입력받아서 정수로 변환한 뒤 num2값에 저장
		String sign = JOptionPane.showInputDialog("기호 +, -, *, / 중 하나를 입력하세요");
		// 기호를 입력받아서 sign값에 저장
		char oper = sign.charAt(0); // sign 배열 중 0번째 문자를 추출하여 oper에 저장

		if (oper == '+') {// oper가 문자 +인지 비교
			System.out.println(num1 + num2);// num1, num2값을 연산하여 출력

		} else if (oper == '-') {// oper가 문자 -인지 비교
			System.out.println(num1 - num2);// num1, num2값을 연산하여 출력

		} else if (oper == '*') {// oper가 문자 *인지 비교
			System.out.println(num1 * num2);// num1, num2값을 연산하여 출력

		} else if (oper == '/') {// oper가 문자 /인지 비교
			System.out.println(num1 * num2);// num1, num2값을 연산하여 출력
		} else {
			System.out.println("잘못된 입력입니다.");
		}

		switch (oper) {

		case '+': // oper가 문자 +인지 비교
			System.out.println(num1 + num2);
			// 문자가 +라면 num1값과 num2값을 더해서 출력
			break;

		case '-':// oper가 문자 -인지 비교
			System.out.println(num1 - num2);
			// 문자가 +라면 num1값에서 num2값을 빼서 출력
			break;

		case '*':// oper가 문자 *인지 비교
			System.out.println(num1 * num2);
			// 문자가 +라면 num1값과 num2값을 곱해서 출력
			break;

		case '/':// oper가 문자 /인지 비교
			System.out.println(num1 / num2);
			// 문자가 +라면 num1값에 num2값을 나눠서 출력
			break;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

	}

}
