package 조건문;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// 투표시스템(무한루프)
		// 인기투표 선택해주세요(1:아이유, 2: 유재석, 3:방탄, 4:종료)
		// 1) 종료가 되는지 확인
		// 2) 투표 진행
		// 3) 종료가 되면, 각 몇 표를 얻었는지 출력

		int person1 = 0, person2 = 0, person3 = 0; // 초기값 입력

		while (true) {
			String popularity = JOptionPane.showInputDialog("1:아이유, 2:유재석, 3:방탄, 4:종료");
			// 1, 2, 3, 4 중 입력할 입력창
			int person = Integer.parseInt(popularity);
			// 입력받은 popularity값을 정수 person값으로 변환

			if (person == 4) {// person값이 4인지 비교
				System.out.println("시스템 종료합니다.");// 4이면 출력
				break;// 4이면 종료
			} else {
				if (person == 1) {// person값이 1인지 비교
					System.out.println("선택 : 아이유");// 1이면 출력
					person1++;// 1이면 person1 초기값에 1을 누적

				} else if (person == 2) {// person값이 2인지 비교
					System.out.println("선택 : 유재석");// 2이면 출력
					person2++;// 2이면 person2 초기값에 1을 누적

				} else if (person == 3) {// person값이 3인지 비교
					System.out.println("선택 : 방탄");// 3이면 출력
					person3++;// 3이면 person3 초기값에 1을 누적

				} else {
					System.out.println("잘못된 투표입니다.");
					// 1, 2, 3, 4 외의 숫자나 문자가 입력될 경우 출력
				}
			} // 큰 else
		} // while
		System.out.println("아이유 인기투표 결과 : " + person1); // person1에 누적된 값을 출력
		System.out.println("유재석 인기투표  결과 : " + person2);// person2에 누적된 값을 출력
		System.out.println("방탄 인기투표  결과: " + person3);// person3에 누적된 값을 출력
	}// main

}// class
