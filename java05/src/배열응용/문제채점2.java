package 배열응용;

import java.util.Random;

public class 문제채점2 {

	public static void main(String[] args) {
		// 문제 1000문제
		// 원래 답안지 0~3까지 중 1000개를 만드세요.
		// 내 답안지 0~3까지 중 1000개를 만드세요.
		// 1) 채점하기, 2) 각 문항 당 오답처리
		// 문항 정답 내답 처리
		// 0 1 1 정답

		Random r = new Random();

		int[] origin = new int[1000];
		int[] my = new int[1000];

		int count = 0;
		for (int i = 0; i < origin.length; i++) {
			origin[i] = r.nextInt(3);

		}
		for (int i = 0; i < my.length; i++) {
			my[i] = r.nextInt(3);
		}
		for (int i = 0; i < my.length; i++) {
			if (origin[i] == my[i]) {
				System.out.println(
						"문항 : " + i + "|" + "정답 : " + origin[i] 
								+ "|" + "내답 : " + my[i] + "|" + "처리 : " + "정답");
				count++;
			} else {
				System.out.println(
						"문항 : " + i + "|" + "정답 : " + origin[i] 
								+ "|" + "내답 : " + my[i] + "|" + "처리 : " + "오답");
			}
		}
		System.out.println("점수는 " + count);

	}

}
