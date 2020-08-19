package 조건문;

public class 연습문제3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// 초기값, 조건식, 증감식
			for (int j = 1; j <= i; j++) { // 초기값, 조건식, 증감식
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 1; i <= 5; i++) {// 초기값, 조건식, 증감식
			for (int j = 1; j <= (5 - i); j++) {// 초기값, 조건식, 증감식
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
