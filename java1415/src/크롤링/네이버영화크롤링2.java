package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹���ȭũ�Ѹ�2 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010#");

		try {
			Document doc = con.get();
			Elements list = doc.select("p > a");
			Elements list2 = doc.select(".h_story");
			Elements list3 = doc.select(".h_tx_story");
			Elements list4 = doc.select(".con_tx");
			//������ h3 �� ��򰡿� a�� �ִٴ� ��
			// �ٷ� ���� �ڽ��� ã������ >�� �־���
			
			//System.out.println(list.size());
			//System.out.println(list);
			System.out.println(list.get(0).text());
			System.out.println(list2.get(0).text());
			System.out.println(list3.get(0).text());
			System.out.println(list4.get(0).text());

		} catch (IOException e) {
			e.printStackTrace();
		} // index.html

	}

}
