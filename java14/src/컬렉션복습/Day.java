//package 컬렉션복습;
//
//public class Day {
//	String doing;
//	int time;
//	String location;
//	
//	// 입력값이 위 3개가 다 있어야 이 부품을 이용할 수 있음.
//	// 입력값(파라메터, 매개변수)가 있는 클래스 이름과 동일한
//	// 메서드를 만들어주세요. 객체생성시 자동 호출됨.
//	// 생성자(메서드, constructor)
//
//	
//
//	public Day(String doing, int time, String location) {
//		this.doing = doing;
//		this.time = time;
//		this.location = location;
//	}
//	public Day() {
//		
//	}
//	// 메서드 이름을 동일하게 할 수 있음
//	// 단, 입력값이 달라야 함.
//	// 하나의 이름을 메서드 이름으로 해서 여러개 만들 수 있음.
//	// 오버로딩(overloading)
//	// => 다형성 (하나의 이름으로 다양한 형태의 메서드를 구현)
//	// 		(polymorphism, 폴리모피즘)
//	
//	
//	// 파라메터를 통해서 만든 멤버변수값을 한꺼번에 출력하고자 하는 경우
//	// toString()을 재정의
//	
//	@Override // 재정의, 오버라이드
//	public String toString() {
//		return "Day [doing=" + doing + ", time=" + time +  "]";
//	}
//
//	
//	
//}
