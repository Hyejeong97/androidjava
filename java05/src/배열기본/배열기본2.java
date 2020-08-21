package 배열기본;

public class 배열기본2 {
	public static void main(String[] args) {
		// 배열은 일반적으로 같은 타입을 묶을 때 사용!
		// 다양한 타입을 묶을 때는 배열을 쓰지 않음!
		// 배열은 고정된 크기를 가진다.(크기 조절 불가능)

		// 1) 일주일간 온도를 넣은 공간을 만들어서
		// 데이터를 넣고 전체출력

		int[] temp = new int[7];

		temp[0] = 25;
		temp[1] = 28;
		temp[2] = 28;
		temp[3] = 29;
		temp[4] = 27;
		temp[5] = 26;
		temp[6] = 27;

		for (int i = 0; i < temp.length; i++) {
			System.out.println(i + 1 + "일차 : " + temp[i]);// i가 0부터여서 +1해줌
		}
	}
}
