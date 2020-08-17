package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 창을 띄워서 입력을 받아보자
		// 창을 띄워서 출력을 해보자
		// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		// 특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할 때 부품에게 지정함.
		
		
		String name = JOptionPane.showInputDialog("당신의 이름은");
		//이름 값을 JOptionPane 부품으로 입력 받은 뒤 name 변수에 저장한다.
		
		System.out.println("당신의 이름은 " + name);
		//RAM에 저장된 name값을 CPU에서 실행하여 모니터에 출력한다
		
		String age = JOptionPane.showInputDialog("당신의 나이는");
		//나이 값을 JOotionPane 부품으로 입력을 받은 뒤 age 변수에 저장한다.
		
		
		//키보드로 입력한 데이터 타입은 무조건 String!
		//String으로 저장된 데이터를 int/String 쓸지는 내가 결정!
		//계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야 함.
		//숫자로 바꿔보자!!
		
		
		int age2 = Integer.parseInt(age);
		//age 변수에서 입력 받은 값을 Integer.parseInt 부품을 이용해 
		//정수로 변환한 뒤 age2 변수에 저장한다.
		
		int lastAge = age2 - 1;
		//age2 변수에 저장된 값에서 CPU를 실행하여 -1연산을 실행한 값을 정수 lastAge 변수에 저장한다.
		
		System.out.println("당신의 작년 나이는 : " + lastAge);
		//RAM에 저장된 lastAge 변수 값을 CPU에서 실행하여 모니터에 출력한다.  
	}

}
