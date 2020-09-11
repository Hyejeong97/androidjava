package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		// 크롤링 : 웹사이트에서 정보를 가지고 오는 것
		// 단순 : 스크랩핑
		// 단순+@: 크롤링

		// 크롤링 순서

		// 1. 사이트연결
		Connection con = Jsoup.connect("https://www.naver.com/");
		// jsoup으로 자동완성하기!
		System.out.println("1. 사이트 연결 성공!!");

		// 2. 해당 페이지 다운로드(html)
		try {
			Document doc = con.get();
			System.out.println("2. 해당 페이지 다운로드 성공!");// index.html
			System.out.println("---------------------------");
			// System.out.println(doc);

			// 3. 원하는 위치의 정보를 추출해냄
			// System.out.println(doc.select("a.nav"));// select는 결과가 여러개
			System.out.println("원하는 위치의 정보를 추출 성공!");
			Elements list = doc.select("a.nav");
			// Elements == ArrayList + @@ 같은 기능
			
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);// a.nav의 i번째를 tag변수 저장
				//System.out.println(tag);// tag 출력
				String text = tag.text();// tag의 텍스트를 text변수 저장
				System.out.println(text);// text 출력
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} // index.html

	}

}
