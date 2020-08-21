package 배열기본;

public class 참조형배열 {

	public static void main(String[] args) {
		String[] names = new String[2];
		
		names[0] = "홍길동"; //홍, 길, 동 => 각각 주소가 들어가서 변수 3개
		names[1] = "김길동";
		System.out.println("개수 : " + names.length);

	}

}
