package 상속;

public class 사람 extends Object {
	// 멤버변수, 멤버메서드
	String name;
	int age;

	public void eat() {
		System.out.println("먹다.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}

	// 파라메터있는 생성자를 정의하게 되면,
	// 파라메터없는 기본 생성자는 자동으로 만들어지지 않는다.
	// new 사람();//불가
	public 사람(String name, int age) {
		super();
		//object부르기 => Object(); 부모의 기본 생성자 호출
		this.name = name;
		this.age = age;
	}

}
