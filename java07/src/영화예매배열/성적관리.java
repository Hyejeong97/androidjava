package 영화예매배열;

import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] sum = new int[5]; // sum 배열선언
		int[] rank = new int[5];// rank 배열선언
		for (int i = 0; i < 5; i++) {// 5회 반복

			System.out.println("[성적관리]");
			System.out.print("학번 : ");
			int stunum = sc.nextInt();//입력받기
			System.out.print("이름 : ");
			String stuname = sc.next();
			System.out.print("1학기 중간고사 : ");
			int mid1 = sc.nextInt();
			System.out.print("1학기 기말고사 : ");
			int final1 = sc.nextInt();
			System.out.print("2학기 중간고사 : ");
			int mid2 = sc.nextInt();
			System.out.print("2학기 기말고사 : ");
			int final2 = sc.nextInt();

			// 1학기 성적차이
			int gap1 = mid1 - final1;
			// 2학기 성적차이
			int gap2 = mid2 - final2;

			// 1학기 성적출력
			System.out.println("\n1학기 중간기말 성적차이 : " + gap1);

			// 2학기 성적출력
			System.out.println("2학기 중간기말 성적차이 : " + gap2);

			// 1학기, 2학기 성적비교
			if ((mid1 + final1) > (mid2 + final2)) {
				System.out.println("\n1학기 성적이 더 우수합니다.");
			} else {
				System.out.println("\n2학기 성적이 더 우수합니다.");
			}

			sum[i] = mid1 + mid2 + final1 + final2;//총점수를 더해서 sum배열에 저장
			rank[i] = 1;//rank배열값을 1로 초기화

			for (int j = 0; j < 5; j++) {
				if (sum[i] < sum[j]) {//원래 sum 점수보다 두번째 sum점수가 높은지 비교
					rank[i]++;//높다면 rank에 +1증가
				}
			}

			System.out.println("\n" + stuname + "의 총 성적은 " 
								+ sum[i] + "이고 " + rank[i] + "등 입니다.");
		}
	}

}
