package 조건문;

import javax.swing.JOptionPane;

public class Switch연습 {

	public static void main(String[] args) {
		// 사원번호입력 : A100
		//A이면 기획부, B이면 총무부, C이면 개발부
		//다른 것이면 해당 부서 없음
		//사원부서는 기획부입니다.
		//사원고유 번호는 100입니다.
		
		
		
		String no = "A100EX";
		char dep = no.charAt(0);
		
		switch(dep) {
		

		case 'A' :
			System.out.println("기획부");
			break;
			
		case 'B' :
			System.out.println("총무부");
			break;
			
		case 'C' :
			System.out.println("개발부");
			break;
			
		default :
			System.out.println("해당없음");
			break;
		}
		String sub = no.substring(1, 4);
		//인덱스 1~3범위 추출이면 substring(1,4)써줌.
		//endIndex는 3보다 1큰 4를 써주어야 함.
		System.out.println("사원고유 번호는 " + sub);

	}

}
