package 영화예매배열;

import java.util.Scanner;

public class 신체검사등급문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] sum = new int[5];
		int sum1 = 0;
		String result = "";
		int hcount = 0;
		int person = 0;
		
		int count = 0;
		int checkscore = 0;
		
		
		
		for (int i = 0; i < 5; i++) {//5회반복
			System.out.println("\n[입력항목]");
			System.out.print("1. 주민번호 : ");
			String personnum = sc.next();
			System.out.print("2. 키 : ");
			double height = sc.nextDouble();
			System.out.print("3. 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("4. 시력 : ");
			double visual = sc.nextDouble();
			System.out.print("5. 병명 1)없음, 2)평발, 3)고혈압 : ");
			int disease = sc.nextInt();

			// 1)현역과 면제 대상자들 카운트
			// 면제 대상-> 키(150~190)사이 외, BMI지수(몸무게/키 *키)>30이상
			// 시력<0.0이하

			if (personnum != "") {//입력값이 있으면
				person++;//person에 +1
			}
			
			if (height < 150 || height > 190) {//조건비교
				if (((weight / height) * height) > 30) {
					if (visual <= 0.0) {
						count++;//조건이 맞다면 +1
						
					}
				}
			}
			
			// 2)검사당 스코어 출력
			if (height >= 150 && height <= 190) {//조건비교
				checkscore = checkscore + 20;// 덧셈연산20하고 누적
			}
			if (weight > 35 && weight < 100) {
				checkscore = checkscore + 20;
			}
			if (visual >= 1.0) {//조건비교
				checkscore = checkscore + 30;//덧셈연산 30하고 누적
			} else if (visual >= 0.5) {
				checkscore = checkscore + 20;
			} else if (visual >= 0.1) {
				checkscore = checkscore + 10;
			}

			System.out.println("\n검사점수 : " + checkscore);

			// 3)병명 스코어 출력
			int dscore = 0;
			if (disease == 1) {//조건비교
				dscore = dscore + 30;//덧셈연산 30하고 누적
			} else if (disease == 2) {
				dscore = dscore + 20;
			} else if(disease == 3) {
				dscore = dscore + 10;
			}

			sum[i] = checkscore + dscore;//연산 값을 sum 배열에 저장

			if ((sum[i]) >= 40) {//조건비교
				result = "현역대상자입니다.\n";
				hcount++;//증가연산
			} else {
				result = "면제대상자입니다.\n";
			}

			System.out.println("총 점수 : " + (sum[i]));//sum출력
			System.out.println("============================");
			System.out.println(result);//결과출력

			sum1 = sum1 + sum[i];//sum의 배열값을 sum1에 누적

			System.out.println("대상자의 총 평균  : " + ((sum1) / person));//sum1에서 사람 수 만큼 나누기
			System.out.println("현역대상자 : " + hcount + "명");//현역대상자 카운트출력
			System.out.println("면제대상자 : " + count + "명");//면제대상자 카운트출력

	}
	}

}
