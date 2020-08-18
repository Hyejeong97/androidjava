package 제어문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		// 1번 String 비교(비교연산자 사용불가)

		// 입력
		String food = JOptionPane.showInputDialog("먹고 싶은 음식");

		// 처리
		String result = ""; // 초기값
		if (food.equals("아이스크림")) {
			result = "뚜레주르로 가요";

		} else if (food.equals("아이스커피")) {
			result = "이디야로 가요";

		} else {
			result = "물 먹어요";
		}

		System.out.println(result); // 출력

		// 입력, 처리, 출력 따로 하는 것이 좋음
	}

}
