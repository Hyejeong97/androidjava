package 영화예매배열;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		Random r = new Random(); // 랜덤값 생성
		Scanner sc = new Scanner(System.in);// 콘솔입력

		int gametotal = 0;// gametotal 초기값
		int comcount = 0;// comcount 초기값
		int draw = 0;// draw 초기값

		int scissor = 0;// scissor 초기값
		int rock = 0;// rock 초기값
		int paper = 0;// paper 초기값
		
		while (true) {//무한루프
			System.out.println("가위0, 바위1, 보2 중 하나를 입력해주세요.[종료는 4]>> ");
			int me = sc.nextInt();// 콘솔 입력을 me로 저장

			if (me == 4) {// me가 4인지 비교
				System.out.println("프로그램을 종료합니다.");
				break;// 프로그램 종료
			}

			System.out.print("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
			System.out.print("★★★★★★★★★★★Game Strat★★★★★★★★★★★★★★\n");

			int com = r.nextInt(3);// 0~2까지 무작위 수를 com에 저장

			System.out.println("컴퓨터의 가위바위보 : " + com);// com 저장값 출력
			System.out.println("나의 가위바위보 : " + me + "\n");// me 입력값 출력
			gametotal++;// 전체횟수 증가연산식

			switch (me) {
			case 0:// me가 0인경우
				if (com == 2) {// com이 2인지 비교
					scissor++;// 가위 증가연산식
				}
				break;
			case 1:// me가 1인경우
				if (com == 0) {// com이 0인지 비교
					rock++;// 바위 증가연산식
				}
				break;

			case 2:// me가 2인경우
				if (com == 1) {// com이 1인지 비교
					paper++;// 보 증가연산식
				}
				break;
			}

			if (com == me) {// com과 me값이 같은지 비교
				draw++;// 비긴횟수 증가연산식
			} else if (com > me) {// com이 me보다 큰지 비교
				comcount++;// 컴퓨터 이긴 횟수 증가연산식
			}

			System.out.println("게임 전체 횟수 " + gametotal + "회");
			System.out.println("컴퓨터 전체 승리 횟수 " + comcount + "회");
			System.out.println("나의 가위로 이긴 횟수 " + scissor + "회");
			System.out.println("나의 바위로 이긴 횟수 " + rock + "회");
			System.out.println("나의 보로 이긴 횟수 " + paper + "회");
			System.out.println("게임 전체 비긴 횟수 " + draw + "회\n");
		}

	}

}
