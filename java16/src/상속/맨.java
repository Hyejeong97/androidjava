package 상속;

public class 맨 extends 사람 { // 사람이 큰 범위
	// 멤버변수2, 메서드1 상속받은 상태
	int power;
	
	//오버로딩(다형성)
	public 맨() {
		super("클라크동생", 5000);
	}
	
	public 맨(String name, int age, int power) {
		super(name, age);
		this.power = power;
	}
	
	
	public void run() {
		eat();// 부모의 메서드는 자식 클래스에서 바로 호출 가능!
		System.out.println("빨리 달리다.");
	}

	@Override
	public String toString() {
		return "맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
