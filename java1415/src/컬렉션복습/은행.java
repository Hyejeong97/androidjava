package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		계좌 account1 = new 계좌("홍길동", "정기적금", 1000);// 값 넣고 생성
		계좌 account2 = new 계좌("김길동", "정기예금", 2000);
		계좌 account3 = new 계좌("오길동", "정기예금", 5000);
		계좌 account4 = new 계좌("조길동", "정기예금", 2000);
		계좌 account5 = new 계좌("최길동", "정기예금", 6000);
		// 동적메모리 할당
		// => 객체 생성 시마다 객체별로 멤버변수가 복사가 되어 변수가 생성
		
		ArrayList<계좌> list = new ArrayList<>();
		list.add(account1);// 리스트에 값 넣기
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		
		계좌파일로저장 file = new 계좌파일로저장();
		
		file.save(list);// 리스트를 넘겨주는 역할
		
		
	}

}
