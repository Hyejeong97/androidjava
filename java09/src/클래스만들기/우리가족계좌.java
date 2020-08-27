package 클래스만들기;

public class 우리가족계좌 {

	public static void main(String[] args) {
		계좌 f = new 계좌();
	
		f.name = "홍길동";
		f.actname = "튼튼적금";
		f.sum = 1000;
		System.out.println("우리 가족 계좌정보");
		System.out.println("---------------------");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("---------------------");
		
		System.out.println(f.name + "\t" + f.actname + "\t" + f.sum);
		
		계좌 m = new 계좌();
		m.name = "박길동";
		m.actname = "튼튼예금";
		m.sum = 2000;
		System.out.println(m.name + "\t" + m.actname + "\t" + m.sum);
		
		계좌 d = new 계좌();
		d.name = "홍기사";
		d.actname = "다음적금";
		d.sum = 3000;
		System.out.println(d.name + "\t" + d.actname + "\t" + d.sum + "\n");
		
		f.입금하다(); System.out.print(", "); d.출금하다();
		System.out.print("\n=> 아버지는 "); f.입금하다(); 
		System.out.print("딸은 ");d.출금하다();
		
	
	}

}
