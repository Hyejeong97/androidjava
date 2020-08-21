package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// 이름(String), 나이(int), 성별(char)
		// 아침(boolean), 몸무게(double) 배열 만들어서 프린트

		
		String[] names = {"조혜정", "홍길동", "도라에몽", "짱구"};
		int[] age = {24, 50, 13, 5};
		char[] gender = {'여', '남', '남', '남'};
		boolean[] breakfast = {true, true, false, false};
		double[] weight = {44.9, 60.8, 25.2, 12.5};
	
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름 : " + names[i] +"\t"
							  + "나이 : " + age[i] +"\t"
								+ "성별 : " + gender[i] +"\t"
								+ "아침 : " + breakfast[i] +"\t"
								+"몸무게 : " + weight[i] + "kg" + "\n");
			
		}
		
		for (String x : names) {
			System.out.println("이름 : " + x);
		}
		for (int y : age) {
			System.out.println("나이 : " + y);
		}
		for (char c : gender) {
			System.out.println("성별 : " + c);
		}
		for (boolean b : breakfast) {
			System.out.println("아침 : " + b);
		}
		for (double d : weight) {
			System.out.println("몸무게 : " + d);
			
		}
		
		
		
	}

}
