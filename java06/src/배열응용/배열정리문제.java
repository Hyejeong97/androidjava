package 배열응용;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1) 10, 20, 30, 40, 50을 배열에 넣어
		// 첫 번째 값과 두 번째 값을 더해서 print!

		int[] num1 = { 10, 20, 30, 40, 50 };// 배열값 저장
		System.out.println("결과 : " + num1[0] + num1[1]);

		
		
		
		// 2) JAVA, SPRING, JSP를 입력받아 넣어보세요.
		// 출력은 **JAVA보다는 SPRING**
		String[] s = new String[3];
		for (int i = 0; i < 3; i++) {
			s[i] = JOptionPane.showInputDialog("과목입력");
			System.out.println("과목입력:" + s[i]);
		}
		System.out.println("**" + s[0] + "보다는 " + s[1] + "**" + "\n");
		
		//배열위치로 출력
		
		

		// 3) 11, 22, 33, 44를 배열에 넣어서
		// 이 중 33은 몇 번째 위치에 있는지 프린트!

		int[] n = { 11, 22, 33, 44 };//배열값 저장

		int target = 33;//target값 저장
		for (int i = 0; i < n.length; i++) {
			if (n[i] == target) {//n배열의 i번째 값이 target값과 같은지 비교
				System.out.println("위치 : " + i + "\n");
				//같다면 i번째 값이라 출력(1부터 시작하고 싶어서 +1을 함)
			}
		}

		
		
		
		// 4)5개의 정수 배열을 만들어서 1~5까지 입력하여 프린트!

		int[] num4 = new int[5];//다섯개의 배열공간을 number로 선언

		for (int i = 0; i < num4.length; i++) {
			num4[i] = i + 1; //i에 1더해서 num4 배열에 저장
		}
		for (int x : num4) {
			System.out.println(x + "");
		}
		
		

		// 5) 66, 77, 88, 99 중 최대값을 찾아보세요!

		int[] num5 = { 66, 77, 88, 99 };//배열값을 저장
		int max = num5[0];//max초기값을 no의 배열값 첫번째로 저장

		for (int i = 1; i < num5.length; i++) {
			if (num5[i] > max) {//no의 i번째가 max보다 큰지 비교
				max = num5[i];//no의 i번째가 max보다 크다면 다시 max에 저장
			}
		}
		System.out.println("최대값은 " + max);//max 출력
		
		
		// 6)
		 int[] num6 = { 66, 77, 88, 99 };//배열값을 저장
		 int imsi = num6[0];//imsi <-66 //백업
		 num6[0] = num6[3]; //num6[0] <-99
		 num6[3] = imsi;//num6[3] <- imsi //백업하는걸 가져옴
		 //변경할 값을 백업한 뒤 넣어줌, 동시작업x
		 
		 
		 for (int x : num6) {
			System.out.println(x + "");
		}
		 System.out.println("");
	}

}









