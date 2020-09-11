package 스테틱;

public class 창업 {

	public static void main(String[] args) {
		직원 employee1 = new 직원("홍길동", '남', 24);// 직원 생성 및 값 넣기
		직원 employee2 = new 직원("김길동", '남', 27);
		직원 employee3 = new 직원("남길동", '여', 29);

		System.out.println("직원 수: " + 직원.count);// 직원 인원 출력
		System.out.println("직원의 평균 나이: " + 직원.agesum);// 직원 나이 누적 출력
		System.out.println(employee1);// 직원 정보 출력
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
