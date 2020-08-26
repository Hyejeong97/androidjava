package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {

		// 1) 이미 예약된 자리는 예약불가
		// 다른 자리 선택하라고 알려주기
		// 2) 종료 시 몇 좌석이 예매가 되었는지 프린트
		// 한 장당 10000원, 결제금액 프린트
		// 3) 좌석번호가 1번부터 시작되게 하기

		Scanner scan = new Scanner(System.in);// 콘솔에서 입력
		int[] seat = new int[11]; // 좌석마다 예매상황을 저장할 공간들
		int count = 0; // count 값 초기화
		while (true) {// 무한루프
			System.out.println("--------------------");
			for (int i = 1; i < seat.length; i++) {
				System.out.print(i + " ");// 좌석번호 출력
			}
			System.out.println();
			System.out.println("--------------------");

			for (int i = 1; i < seat.length; i++) {
				System.out.print(seat[i] + " ");// i의 값을 seat배열에 저장
				// seat배열이 비어있어서 0으로 출력됨
			}
			System.out.println();
			System.out.println("원하는 좌석 입력(종료-1)>> ");// 좌석번호 입력

			int choice = scan.nextInt();// 숫자 입력받음
			if (choice == -1) { // 입력받은 수가 -1인지 비교
				System.out.println("프로그램 종료!");// -1일때 출력
				System.out.println("예약된 좌석은 " + count + "개 입니다.");
				System.out.println("결제금액 : " + count * 10000);
				break;
			}

			if (seat[choice] == 1) {// seat배열의 값에 choice입력값이 1인지 비교
				System.out.println("이미 예약된 자리입니다. 다른 자리를 예약해주세요.");
			} else {
				seat[choice] = 1; // choice의 입력값이 seat배열의 공간에 1이 저장
				System.out.println("예약을 완료했습니다.");
				count++; //예약된 좌석 증가연산자

			}

			// 선택한 번호의 좌석을 예약처리

		}

	}

}
