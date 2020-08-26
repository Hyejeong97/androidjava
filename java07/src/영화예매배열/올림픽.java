package 영화예매배열;

import java.util.Scanner;

public class 올림픽 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] country = { "한국", "중국", "일본"};
		String[] kind2 = { "피겨", "스키", "스피드스케이팅","쇼트트랙", "스켈레톤"};
		int[] rank = new int[3]; 
		int[] kind = new int[5];

		int gcount = 0;
		int scount = 0;
		int bcount = 0;
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			
			System.out.println("\n[" + country[i] +" 올림픽 메달 입력]");
			System.out.println("금2, 은1, 동0을 입력해주세요.");
			System.out.print("피겨 : ");
			kind[0] = sc.nextInt();
			System.out.print("스키 : ");
			kind[1] = sc.nextInt();
			System.out.print("스피드스케이팅 : ");
			kind[2] = sc.nextInt();
			System.out.print("쇼트트랙 : ");
			kind[3] = sc.nextInt();
			System.out.print("스켈레톤 : ");
			kind[4] = sc.nextInt();

			
			rank[i] = 1;
			
			for (int j = 0; j < 5; j++) {
				if(kind[j] == 2) {
					System.out.println(kind2[j] + "\t1등");
					sum = sum + kind[j];
					gcount++;
				}
				if(kind[j] == 1) {
					System.out.println(kind2[j] + "\t2등");
					sum = sum + kind[j];
					scount++;
				}
				if(kind[j] == 0) {
					System.out.println(kind2[j] + "\t3등");
					sum = sum + kind[j];
					bcount++;
				}
				
				
				
			}
			System.out.println("\n금메달 개수 : " + gcount +"개");
			System.out.println("은메달 개수 : " + scount +"개");
			System.out.println("동메달 개수 : " + bcount +"개");
			
			
			
			
			
			
			
		}

	}

}
