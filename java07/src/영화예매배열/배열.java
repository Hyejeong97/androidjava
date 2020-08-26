package 영화예매배열;

public class 배열 {

	public static void main(String[] args) {
		// 1)
		int[] n1 = new int[6];// 배열 6개선언

		for (int i = 0; i < 6; i++) {
			n1[i] = i * 10; // i * 10 연산해서 num배열에 저장
			System.out.print(n1[i] + " ");// 출력

		}
		// 2
		int count = 0;
		for (int x : n1) {
			if (x > 30) {
				count++;
			}
		}
		System.out.println("\n" + count + "개");

		// 3
		int[] n2 = n1.clone();
		n2[0] = 60;
		for (int i = 0; i < n2.length; i++) {
			System.out.print(n2[i] + " ");
		}
		System.out.println("\n");
		
		// 4
		for (int i = 0; i < n2.length; i++) {
			if (n2[i] == n1[i]) {
				System.out.print(n2[i] + " ");
			}
		}

	}

}
