package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		// . => 접근연산자
		휴대폰 p1 = new 휴대폰();
		// color, size, company 멤버변수 복사 => 자동초기화, 배열처럼
		// p1변수 생성 => 멤버변수들을 가르키는 주소가 들어감.
		p1.color = "흰색";// 찍을때 값을 넣어줌, 멤버변수
		p1.size = 7;//멤버변수
		p1.company = "삼성";//멤버변수
		System.out.println("p1 휴대폰의 색은 " + p1.color);
		System.out.println("p1 휴대폰의 크기는 " + p1.size);
		System.out.println("p1 휴대폰의 회사는 " + p1.company);
		p1.문자하다();//멤버메서드

		System.out.println("======================");

		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강";
		p2.size = 11;
		p2.company = "애플";
		System.out.println("p1 휴대폰의 색은 " + p2.color);
		System.out.println("p1 휴대폰의 크기는 " + p2.size);
		System.out.println("p1 휴대폰의 회사는 " + p2.company);
		p2.전화하다();

		System.out.println("\n====================");
		System.out.println("[강아지]");
		강아지 d1 = new 강아지();
		d1.color = "brown";// 변수가 하나씩 따로 생성
		d1.kind = "Poodle";
		d1.weight = 3.8;
		System.out.println("d1 강아지의 색은 " + d1.color);
		System.out.println("d1 강아지의 종류는 " + d1.kind);
		System.out.println("d1 강아지의 무게는 " + d1.weight);
		d1.짖다();

		System.out.println("====================");

		강아지 d2 = new 강아지();
		d2.color = "white";// 변수가 하나씩 따로 생성
		d2.kind = "Maltese";
		d2.weight = 4.4;
		System.out.println("d2 강아지의 색은 " + d2.color);
		System.out.println("d2 강아지의 종류는 " + d2.kind);
		System.out.println("d2 강아지의 무게는 " + d2.weight);
		d2.먹다();

	}

}
