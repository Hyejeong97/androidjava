package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�1 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");
		try {
			Document doc = con.get();
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();// �ϳ����� get���� ��������
			System.out.println("ȸ�� �̸�: " + name);

			Elements list2 = doc.select("span.code");
			String code = list2.get(0).text();// �ϳ����� get���� ��������
			System.out.println("ȸ�� �ڵ�: " + code);

			Elements list3 = doc.select("div.today");

			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text();// ���簡
			String dif = list4.get(1).text();// ����
			String percent = list4.get(2).text();// ��������
			
			System.out.println("���簡: " + now);
			System.out.println("�������� ����: " + dif);
			System.out.println("��������: " + percent);
			
			Elements list5 = doc.select("td.first span.blind");
			String before = list5.get(0).text();// ����
			System.out.println("���� " + before);
			
			Elements list6 = doc.select(".no_up span.blind");
			String up = list6.get(0).text();// ��
			System.out.println("�� " + up);
			
			
			
			

		} catch (IOException e) {
			e.printStackTrace();
		} // index.html

	}

}
