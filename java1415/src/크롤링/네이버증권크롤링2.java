package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	//293490 카카오게임즈
	//068270 셀트리온
	//019170 신풍제약
	//047820 초록뱀
	//238090 앤디포스
	
	public String[] crawl(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		String[] result = null;
		try {
			Document doc = con.get();
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();// 하나여도 get으로 꺼내야함
			System.out.println("회사 이름: " + name);

			Elements list2 = doc.select("span.code");
			String code2 = list2.get(0).text();// 하나여도 get으로 꺼내야함
			System.out.println("회사 코드: " + code2);

			Elements list3 = doc.select("div.today");

			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text();// 현재가
			String dif = list4.get(1).text();// 차이
			String percent = list4.get(2).text();// 증감비율
			
			System.out.println("현재가: " + now);
			System.out.println("어제와의 차이: " + dif);
			System.out.println("증감비율: " + percent);
			
			Elements list5 = doc.select("td.first span.blind");
			String before = list5.get(0).text();// 전일
			System.out.println("전일 " + before);
			
			Elements list6 = doc.select(".no_up span.blind");
			String up = list6.get(0).text();// 고가
			System.out.println("고가 " + up);
			
			System.out.println("====================================");
			
			result = new String[] {name, code, now, dif, percent, before, up};
			//p221 바깥에서 초기화 하면 new String[]을 붙여주어야 함
		} catch (IOException e) {
			e.printStackTrace();
		} // index.html
		
		return result;

	}

}
