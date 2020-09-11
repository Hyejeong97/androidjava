package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ��������ũ�Ѹ� {
	public String[] crawl(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		String[] result = null;
		try {
			Document doc = con.get();
			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text();// ���簡
			String dif = list4.get(1).text();// ����
			String percent = list4.get(2).text();// ��������
			Elements list5 = doc.select("td.first span.blind");
			String before = list5.get(0).text();// ����			
			Elements list6 = doc.select(".no_up span.blind");
			String up = list6.get(0).text();// ��

			
		
			result = new String[] {now, dif, percent, before, up};
			//p221 �ٱ����� �ʱ�ȭ �ϸ� new String[]�� �ٿ��־�� ��
		} catch (IOException e) {
			e.printStackTrace();
		} // index.html
		
		return result;
}
}
