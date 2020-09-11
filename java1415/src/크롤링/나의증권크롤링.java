package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 나의증권크롤링 {
	public String[] crawl(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		String[] result = null;
		try {
			Document doc = con.get();
			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text();// 현재가
			String dif = list4.get(1).text();// 차이
			String percent = list4.get(2).text();// 증감비율
			Elements list5 = doc.select("td.first span.blind");
			String before = list5.get(0).text();// 전일			
			Elements list6 = doc.select(".no_up span.blind");
			String up = list6.get(0).text();// 고가

			
		
			result = new String[] {now, dif, percent, before, up};
			//p221 바깥에서 초기화 하면 new String[]을 붙여주어야 함
		} catch (IOException e) {
			e.printStackTrace();
		} // index.html
		
		return result;
}
}
