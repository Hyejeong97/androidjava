package 배열응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {

		int[] age = { 99, 20, 100, 88, 33, 24, 10, 77 };
		// 배열 복사할때는 clone()함수 사용!
		// 깊은 복사, 배열은 깊은 복사를 해야한다.
		// 깊은 복사를 해야 배열은 따로따로 만들어진다.
		int[] age2 = age.clone();// 복사

		for (int x : age) {
			System.out.print(x + " ");
		}
		System.out.println("\n--------------------------");

		age2[0] = 999;
		for (int x : age2) {
			System.out.print(x + " ");
		}
		System.out.println("\n--------------------------");

		/////////////////////////////////////////////////////
		Arrays.sort(age);// 최소값 최대값 찾을 때 편리
		// 파괴함수, 비파괴함수

		for (int x : age) {
			System.out.println(x + " ");// 오름차순
		}

	}

}
