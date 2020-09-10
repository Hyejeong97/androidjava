package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		// ũ�Ѹ� : ������Ʈ���� ������ ������ ���� ��
		// �ܼ� : ��ũ����
		// �ܼ�+@: ũ�Ѹ�

		// ũ�Ѹ� ����

		// 1. ����Ʈ����
		Connection con = Jsoup.connect("https://www.naver.com/");
		// jsoup���� �ڵ��ϼ��ϱ�!
		System.out.println("1. ����Ʈ ���� ����!!");

		// 2. �ش� ������ �ٿ�ε�(html)
		try {
			Document doc = con.get();
			System.out.println("2. �ش� ������ �ٿ�ε� ����!");// index.html
			System.out.println("---------------------------");
			// System.out.println(doc);

			// 3. ���ϴ� ��ġ�� ������ �����س�
			// System.out.println(doc.select("a.nav"));// select�� ����� ������
			System.out.println("���ϴ� ��ġ�� ������ ���� ����!");
			Elements list = doc.select("a.nav");
			// Elements == ArrayList + @@ ���� ���
			
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);// a.nav�� i��°�� tag���� ����
				//System.out.println(tag);// tag ���
				String text = tag.text();// tag�� �ؽ�Ʈ�� text���� ����
				System.out.println(text);// text ���
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} // index.html

	}

}
