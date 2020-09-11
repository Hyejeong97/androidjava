package 컬렉션복습;

public class 나의일지2 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "개 생성됨.");

		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "개 생성됨.");

		Day day3 = new Day("운동", 10, "피트니스");
		System.out.println(Day.count + "개 생성됨.");
		// 보통 클래스 이름으로 접근, 클래스만 대문자로 시작

		System.out.println("전체 시간: " + Day.sum);

		System.out.println("평균 시간: " + Day.sum / Day.count);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		
	}
}
