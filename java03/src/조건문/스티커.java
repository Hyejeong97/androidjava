package 조건문;

import javax.swing.JOptionPane;

public class 스티커 {

	public static void main(String[] args) {

		int price1 = 3000; // price1 값을 3000으로 초기화
		int price2 = 5000;// price2 값을 5000으로 초기화

		String sticker = JOptionPane.showInputDialog("스티커 구입 개수");
		// 스티커 구입 개수 입력창
		String note = JOptionPane.showInputDialog("노트 구입 개수");
		// 노트 구입 개수 입력창
		int num1 = Integer.parseInt(sticker);
		// sticker값을 정수 num1변수에 저장
		int num2 = Integer.parseInt(note);
		// note값을 정수num2변수에 저장

		System.out.println("스티커 개수 : " + num1);// num1값을 출력
		System.out.println("스티커 가격 : " + price1 + "\n");// price1값을 출력

		int sp = num1 * price1;// sticker price
		// num1값과 price1값을 곱하기 연산한 뒤 sp변수에 저장

		System.out.println("노트 개수" + num2);// num2값을 출력
		System.out.println("노트 가격 : " + price2 + "\n");// price2값을 출력

		int np = num2 * price2;// note price
		// num2값과 price2값을 곱하기 연산한 뒤 np변수에 저장

		System.out.println("스티커 총 가격 : " + sp);// sp값을 출력
		System.out.println("노트 총 가격 : " + np + "\n");// np값을 출력

		System.out.println("---------------------" + "\n");

		if ((sp + np) < 25000) {// sp+np값이 25000이하인지 비교
			System.out.println("총 결제금액 : " + (sp + np) + "\n");
			// 이하라면 sp+np값을 출력

		} else if ((sp + np) >= 25000) {// sp+np값이 25000이상인지 비교
			System.out.println("25000원 이상 구매시" + "\n" + "3000원 할인된 결제금액 : " + ((sp + np) - 3000));
			// 이상이면 (sp+np)-3000 연산값을 출력
		}

	}

}
