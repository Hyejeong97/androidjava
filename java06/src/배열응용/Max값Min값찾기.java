package 배열응용;

import java.util.Random;

public class Max값Min값찾기 {

	public static void main(String[] args) {
		Random r = new Random();// 랜덤값 생성

		int[] num = new int[1000];// int 1000개 num 선언

		int min = num[0]; // num의 첫 번째 배열 값 min에 저장
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000) - 444;
			if (num[i] < min) { // num의 i번째 값이 min에 저장된 값보다 작은지 비교
				min = num[i];// num의 i번째 값이 min보다 작다면 다시 min에 저장
			}
		}

		int max = num[0];// num의 첫 번째 배열 값 max에 저장
		int count = 0;// count변수 초기화
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000) - 444;// 0~999 중 랜덤생성한 값을 num의 i번째 차곡차곡 저장
			if (num[i] > max) {// num의 i번째 값이 max보다 큰지 비교
				max = num[i];// 크다면 다시 max에 저장
				count++;// 위 조건이 맞다면 count변수값 +1
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {// num의 i번째 값과 max의 값이 같은지 비교
				System.out.println(max + "의 위치 : " + i); // 같다면 i(순서)를 출력
			}
		}
		System.out.println("max값은 : " + max);// max값 출력
		System.out.println("min값은 : " + min);// 최소값 출력
		System.out.println("max의 개수 : " + count);// max개수 출력

	}

}
