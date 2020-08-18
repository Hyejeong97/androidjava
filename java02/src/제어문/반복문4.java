package 제어문;

public class 반복문4 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 0; i<100; i++) {
			//System.out.println(i);
			if(i % 4 ==0) {
				System.out.println(i);
				count++; //하나씩 대조하는 방법, 횟수
			}
		}
		System.out.println(count);
		
		int x = 10;
		if(x>=5){
			System.out.println(true);
	}
	}

}
