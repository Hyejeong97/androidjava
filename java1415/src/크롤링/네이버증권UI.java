package 크롤링;

import java.io.FileWriter;

public class 네이버증권UI {

	public static void main(String[] args) {
		String[] codes = { "293490", "068270", "019170", "047820", "238090" };
		// String[] names = {"카카오게임즈", "셀트리온", "신풍제약","초록뱀", "앤디포스"};

		네이버증권크롤링2 naver = new 네이버증권크롤링2();

		for (int i = 0; i < codes.length; i++) {
			String[] result = naver.crawl(codes[i]);
			try {
				FileWriter file = new FileWriter(result[0] + ".txt");
				file.write(result[0] + "\n");// 이름
				file.write(result[1] + "\n");// code
				file.write(result[2] + "\n");// 현재가
				file.write(result[3] + "\n");// 어제와의 차이
				file.write(result[4] + "\n");// 증감비율
				file.write(result[5] + "\n");// 전일
				file.write(result[6] + "\n");// 고가
			} catch (Exception e) {
				System.out.println("파일 저장 중 에러 발생!");
			}

		}

	}

}
