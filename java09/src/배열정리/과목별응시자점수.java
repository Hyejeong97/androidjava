package 배열정리;

public class 과목별응시자점수 {

	public static void main(String[] args) {
		int[][] test = new int[4][];

		int[] s1 = {50,60,70,80,90};
		int[] s2 = {66,77,88};
		int[] s3 = {90,80,70,60};
		int[] s4 = {77,100};
		
		test[0] = s1;
		test[1] = s2;
		test[2] = s3;
		test[3] = s4;
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}System.out.println();
		}

	}

}
