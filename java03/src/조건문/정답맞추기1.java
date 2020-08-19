package 조건문;

import javax.swing.JOptionPane;

public class 정답맞추기1 {

	public static void main(String[] args) {

		int target = 88;
		int no = 0;// 틀린 횟수 초기값
		int count = 0;// 전체 횟수 초기값

		while (true) {
			String question = JOptionPane.showInputDialog("숫자를 입력하세요.");
			int answer = Integer.parseInt(question);
			// 입력받은 question을 정수 answer로 변환

			count++; //if문이 실행될 때마다 count초기값에 +1씩 증가
			if (answer == target) {//입력받은 값과 target값을 비교 
				System.out.println("축하합니다.");//조건이 true 이면 출력
				break; //출력하고 종료

			} else {
				no++;//else 안의 if문이 실행될 때마다 no초기값에 +1씩 증가

				if (answer > target) { //answer값이 target값 비교
					System.out.println("너무 커요!");//조건이 true이면 출력

				} else { 
					System.out.println("너무 작아요!");//이외의 조건일 때 출력
				} // else
			} // if
		} // while
		System.out.println("전체 시도 횟수: " + count + "회"); //count를 출력
		System.out.println("틀린 시도 횟수: " + no + "회");//no를 출력
	}// main
}// class







