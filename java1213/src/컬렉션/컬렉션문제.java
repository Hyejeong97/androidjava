package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션문제 {

	public static void main(String[] args) {
		// 1)
		ArrayList run = new ArrayList();

		System.out.println("1번");
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");

		for (int i = 0; i < run.size(); i++) {
			System.out.println((i + 1) + "등 " + run.get(i));
		}
		System.out.println();

		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println((i + 1) + "등 " + run.get(i));
		}
		System.out.println();

		// 2)

		HashMap cus = new HashMap();

		System.out.println("2번");
		cus.put(100, "김데이");
		cus.put(200, "김사전");
		cus.put(300, "김구조");
		cus.put(400, "김자료");

		System.out.println(cus);

		cus.remove(200);
		cus.put(300, "김충성");// 값 변경
		
		System.out.println(cus);
		System.out.println();
		
		
		//4번
		System.out.println("4번");
		HashSet tr = new HashSet();
		
		tr.add("유럽");
		tr.add("일본");
		tr.add("필리핀");
		tr.add("캐나다");
		tr.add("미국");
		tr.add("일본");
		tr.add("필리핀");
		
		System.out.println("전체 여행지 " + tr);
		
		
		

	}

}
