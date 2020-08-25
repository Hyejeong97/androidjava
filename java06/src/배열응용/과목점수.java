package 배열응용;

public class 과목점수 {

	public static void main(String[] args) {
		// 1학기, 2학기 점수를 프린트
		// 점수가 변경된 과목의 수
		// 1학기, 2학기 중 평균이 더 높은 학기는?
		// 점수가 변경된 과목명은?

		String[] subject = { "국어", "수학", "과학", "컴퓨터", "영어" };//배열값 저장
		int[] score1 = { 100, 99, 77, 87, 66 };//배열값 저장
		int[] score2 = score1.clone();//배열값 복사

		System.out.print("1학기 점수는 ");
		for (int x : score1) {
			System.out.print(x + " ");//score1값 출력
		}

		score2[2] = 44;//score2 3번째 배열 새로 저장
		score2[4] = 55;//score2 5번째 배열 새로 저장
		System.out.print("\n2학기 점수는 ");
		for (int x : score2) {
			System.out.print(x + " ");//score2값 출력
		}
		System.out.println(" ");
		
		
		int count = 0;//count값 초기화
		for (int i = 0; i < score2.length; i++) {
			if(score1[i] != score2[i]) {//score1 값과 score2 값이 같지 않은 부분 비교
				System.out.println("점수변경된 과목명 : " + subject[i]);
				//같지 않은 배열 값의 순서를 subject 배열의 순서에 넣어서 해당 값을 불러온다
				count++;//같지 않았을 때 count +1증가
			}
		}
		System.out.println("점수가 변경된 과목 수는 " + count + "개");
		
		double sum1 = 0;//sum1값 초기화
		double sum2 = 0;//sum2값 초기화
		for (int i = 0; i < score2.length; i++) {
			sum1 = sum1 + score1[i];//sum1초기값에 score1값을 누적하여 더함
			sum2 = sum2 + score2[i];//sum2초기값에 score2값을 누적하여 더함
		}
			double div1 = sum1/5;//평균을 내기 위해 sum1에서 5를 나눈 값을 div1에 저장
			double div2 = sum2/5;//평균을 내기 위해 sum2에서 5를 나눈 값을 div2에 저장
		
			if(div1 > div2) {//div1과 div2의 값을 비교
				System.out.println("1학기 평균이 2학기 보다 높습니다.");
			}else {
				System.out.println("2학기 평균이 1학기 보다 높습니다.");
			}
		
		
		

	
	}

}
