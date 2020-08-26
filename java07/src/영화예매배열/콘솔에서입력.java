package 영화예매배열;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// 콘솔에서 입력: Scanner
		// 모든 입력의 데이터 타입은 String!!
		Scanner scan = new Scanner(System.in);
		// 외부에서 데이터를 가져옴(Console에서),system.in(키보드)
		
		System.out.print("이름을 입력>> ");

		String x = scan.next();// 단어입력
		System.out.println("이름 : " + x);
		System.out.print("\n나이를 입력>> ");
		
		int y = scan.nextInt();//String입력을 int로 바꿔줌
		System.out.println("내년 나이는 : " + (y+1) +"년\n");
		
		// 현재키 : 150.5
		// 내년키 : 170.5
		
		// 밖에 비가 오나 : true
		// true이면 우산을 가지고 가자
		// false이면 우산을 놓고 가자
		
		System.out.print("현재 키 입력 : ");
		
		double z = scan.nextDouble();
		System.out.println("내년 키 : " + ( z + 20 ) +"\n");
		
		System.out.print("밖에 비가 오나요?");
		Boolean q = scan.nextBoolean();
		if(q) {
			System.out.println("우산을 가지고 가자!");
		}else {
			System.out.println("우산을 놓고 가자!");
		}
		System.out.print("당신의 목표는>> ");
		scan.nextLine();//위의 엔터를 인식하기 때문에 한번 버려줘야함
		String life = scan.nextLine();//엔터치기까지의 문장
		
		System.out.println("목표는 " + life);
		
	}

}
