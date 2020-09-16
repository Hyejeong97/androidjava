package 상속;

public class CafeCoffee {

	public static void main(String[] args) {
		CoffeeTruck ct = new CoffeeTruck();
		
		ct.price = 2000;//차 가격
		ct.color = "blue";//차 색깔
		ct.coffee = "ice";//커피
		ct.size = 5;//차 사이즈
		
		System.out.println(ct);
		
		ct.drive();//운전하다
		ct.ride();//타다
		ct.sell();//팔다
		ct.stop();//정차하다

	}

}
