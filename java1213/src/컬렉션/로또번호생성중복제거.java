package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호생성중복제거 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();

		while (lotto.size() < 6) {// 6자리가 아니라면 계속 반복
			lotto.add(r.nextInt(45) + 1);
			// 1~45까지 번호 생성하여 값 넣기

		}
		System.out.println(lotto);// 6개 이상이면 출력
	}

}
