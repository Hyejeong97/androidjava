package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] seat = new int[3][5];// [행][열] //seat은 주소가 들어가는 참조형변수,length빼고 16개 변수
		// 배열을 선언순간 공간이 할당
		// seat : 참조형 변수(주소)
		// int[3][5] : 기본형 변수(값)
		// 배열은 자동 초기화 int -> 0
		System.out.println(seat);
		// 		0 1 2 3 4
		// 0 	0 0 0 0 0 // for문 하나
		// 1 	0 0 0 0 0
		// 2	0 0 0 0 0
		
		seat[0][0] = 1;//[행][열]으로 좌표처럼 값 넣기
		seat[0][4] = 1;
		seat[2][4] = 1;
		seat[1][2] = 1;
		seat[2][1] = 1;
		System.out.println("행의 개수 : " + seat.length);
		for (int i = 0; i < seat.length; i++) { //0, 1, 2(행)
			for (int j = 0; j < seat[i].length; j++) {//열
				//seat[i].length 행 안의 열의 개수가 돌아감 
				System.out.print(seat[i][j] + " ");
				
			}System.out.println();
		}

	}

}
