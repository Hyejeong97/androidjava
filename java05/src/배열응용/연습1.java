package 배열응용;

import java.util.Random;

public class 연습1 {

	public static void main(String[] args) {
		// 임의의 값 100개를 만들어서
		// 1) 배열에 넣고
		// 2) 전체를 출력
		// 3) 첫 번째 값과 마지막 값 더하기
		
		
		Random r = new Random();

		
		int[] data = new int[100];
		for (int i = 0; i < 100; i++) {
			data[i] = r.nextInt(100);
		}
		
		for (int x : data) {
			System.out.println(x);
		}
		
		System.out.print("첫 번째 값과 마지막 값의 합은 : ");
		System.out.println(data[0] + data[99]);
		
	}

}
