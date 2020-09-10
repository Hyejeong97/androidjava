package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 계좌파일로저장 {

	public void save(ArrayList<계좌> list) {// 계좌생성 넘겨받아 저장
		System.out.println(list.size() + "명의 계좌를 넘겨받았습니다.");

		for (int i = 0; i < list.size(); i++) {// 컨테이너에서 하나씩 꺼내기
			계좌 account = list.get(i);

			System.out.println("전달된 계좌: " + account);
			System.out.println("-------------------------");

			try {
				FileWriter w2 = new FileWriter(account.name + ".txt");
				w2.write(account.name + "\n");
				w2.write(account.field+ "\n");
				w2.write(account.money + "\n");
				w2.close();// 파일에다가 다 썼음.

			} catch (Exception e) {

				System.out.println("파일로 저장하다가 에러가 발생함!");
			}

		}
	}

}
