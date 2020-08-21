package 배열응용;

import java.util.Random;

public class 입력해서넣어보자3 {

	public static void main(String[] args) {

		Random r = new Random();// 아무거나 만들어주는 클래스 ex)int, boolean..

		int[] data = new int[100000]; // 3개의 공간을 만들어줌
		for (int i = 0; i < 100000; i++) {

			data[i] = r.nextInt(100); // 100보다 작은것만 만들어보자
			// nextint에서 int는 데이터 타입을 말함

		}
		for (int x : data) {
			System.out.println(x);
		}
	}

}
