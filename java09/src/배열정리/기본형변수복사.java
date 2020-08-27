package 배열정리;

public class 기본형변수복사 {

	public static void main(String[] args) {
		// 기본형변수(정수,실수,문자,논리)
		int x = 300; //int 변수에 -21억~21억까지 저장할 수 있음
		int y = x; //값이 복사가 됨.
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("-----------");
		x = 500;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		

	}

}
