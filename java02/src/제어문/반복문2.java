package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정해진 횟수만큼 반복해보자.
		
		int start1 = 1; //시작값
		int end1 = 5;//끝값
		int add1 = 1;//증가값

		while (start1 <= end1) {
			System.out.println(start1);
			start1 = start1 + add1;
			
			
			
			
			//1번) 100부터 1까지 프린트
			int max = 100; //max 변수에 100을 저장
			int min = 1; //min 변수에 1을 저장
			//int minor = 1; // minor 변수에 1을 저장
			
			while(max >= min) { 
				// cpu에서 max 변수에 저장된 값과 min 변수에 저장된 값을 비교한다.
				// max의 값인 100이 min값인 1이상 일 때까지 출력 
				
				System.out.println(max);
				// cpu에서 조건식이 true이면 max값을 출력한다.
				
				max--;//증감연산자
				//max = max - minor;
				// max값을 출력한 뒤 
				// max 값에서 minor변수에 저장된 값을 뺄셈한 뒤 다시 max값을 출력한다.
			}
			System.out.println("---------");
			
			//2번) 5부터 10까지 프린트
			int start = 5; //start 변수에 5를 저장
			int end = 10; //end 변수에 10을 저장
			int add = 1; //add 변수에 1을 저장
			
			while(start <= end) {
				//cpu에서 start 변수에 저장값과 end 변수에 저장값을 비교한다.
				//start의 값인 5가 end 값인 10이하 일 때까지 출력
				System.out.println(start);
				//cpu에서 조건식이 true이면 strat값을 출력한다.
				
				start++;//증감연산자
				//start = start + add;
				//start값을 출력한 뒤
				//start값에서 add에 저장된 변수값을 더한 뒤 다시 start 값을 출력한다.
			}
			System.out.println("---------");
			//3번) 1부터 100까지 중 2씩 증가하면서 프린트
			int s = 1; //s변수에 1을 저장
			int e = 100;//e변수에 100을 저장
			int a = 2;//a변수에 2를 저장
			
			while(s <= e) {
				//cpu에서 s변수와 e변수를 비교한다
				//s값인 1이  e값인 100이하 일 때까지 출력
				System.out.println(s);
				//cpu에서 조건식이 true이면 s값을 출력
				s = s + a;
				//s값을 출력한 뒤
				//s값에서 a에 저장된 변수값을 더한 뒤 다시 s값을 출력한다.
			}
			
		}
		
	}

}
