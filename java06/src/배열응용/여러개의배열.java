package 배열응용;

public class 여러개의배열 {

	public static void main(String[] args) {
		String[] family = {"아버지", "어머니", "형", "나", "동생"};//배열값 저장
		int[] age = {100, 88, 33, 24, 10};//배열값 저장
		double[] height = {177.5, 152.2, 190.3, 167.7, 155.3};//배열값 저장
		
		System.out.println("우리집 식구 정리");
		System.out.println("---------------------");
		System.out.println("이름" + "\t" + "나이" + "\t" + "키");
		System.out.println("---------------------");
		
		for (int i = 0; i < 2; i++) {
			System.out.println(family[i] +"\t"+ age[i] + "\t" + height[i]);//각 배열의 i번째를 출력
		}
		

	}

}
