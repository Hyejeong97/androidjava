package 조건문;

import javax.swing.JOptionPane;

public class 은행시스템 {

	public static void main(String[] args) {
		// 은행 입출금 시스템
		// 1)입금 2)출금 3)잔고 4)종료
		// 선택>> 1
		// 입금액 입력>> 1000

		// 1)입금 2)출금 3)잔고 4)종료
		// 선택>> 3
		// 잔고는 10000원

		// 1)입금 2)출금 3)잔고 4)종료
		// 선택>>2
		// 출금액 입력>> 2000

		// 1)입금 2)출금 3)잔고 4)종료
		// 선택>>3
		// 잔고는 8000원

		// 1)입금 2)출금 3)잔고 4)종료
		// 선택>>4
		// 시스템을 종료합니다.

		int money = 0;// 초기값 입력

		while (true) {
			String enter = JOptionPane.showInputDialog("1)입금, 2)출금, 3)잔고, 4)종료");
			// 입금, 출금, 잔고, 종료 입력 창
			int input = Integer.parseInt(enter);
			// 입력받은 enter값 정수 input값으로 변환

			if (input == 4) {// input값이 4인지 비교
				System.out.println("선택>>" + 4); // 4이면 출력
				System.out.println("시스템을 종료합니다."); // 4이면 출력
				break; // 출력과 종료

			} else {
				if (input == 1) {// input값이 1인지 비교
					System.out.println("선택>>" + 1);// 1이면 출력
					String input1 = JOptionPane.showInputDialog("입금액을 입력하세요.");
					// 1번일때 입금액 입력창
					int cash1 = Integer.parseInt(input1);
					// 입력창에서 입력받은 input1을 정수 cash1로 변환
					System.out.println("입금액 입력>>" + cash1);
					// 정수 cash1을 출력
					money = money + cash1;
					// money초기값에 cash1값을 더하기 연산하여 누적

				} else if (input == 2) {// input값이 2인지 비교
					System.out.println("선택>>" + 2);// 2이면 출력
					String input2 = JOptionPane.showInputDialog("출금액을 입력하세요.");
					// 2번일때 출금액 입력창
					int cash2 = Integer.parseInt(input2);
					// 입력창에서 입력받은 input2를 정수 cash2로 변환
					System.out.println("출금액 입력>>" + cash2);
					// 정수 cash2를 출력
					money = money - cash2;
					// 누적된 money값에서 cash2를 빼기 연산하여 누적

				} else if (input == 3) {// input값이 3인지 비교
					System.out.println("선택>>" + 3); // 3이면 출력
					System.out.println("잔고는 " + money);
					// 누적된 money값을 출력

				} else {
					System.out.println("잘못된 선택입니다.");
					// input값이 1, 2, 3, 4 이외의 숫자 및 문자를 선택했을 때 출력
				}
			} // else

		} // while

	}// main
}// class
