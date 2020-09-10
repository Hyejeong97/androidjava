package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버영화크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010#");

		try {
			Document doc = con.get();
			Elements list = doc.select("h3 a");
			//공백이 h3 안 어딘가에 a가 있다는 뜻
			// 바로 밑의 자식을 찾으려면 >를 넣어줌
			
			System.out.println(list.size());
			//System.out.println(list);
			System.out.println(list.get(0).text());

		} catch (IOException e) {
			e.printStackTrace();
		} // index.html

	}

}
