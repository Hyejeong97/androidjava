package 스테틱;

public class 직원 {
	String name;// 이름
	char gender;// 성별
	int age;// 나이

	static int agesum;// 나이누적
	static int count;// 인원누적

	public 직원(String name, char gender, int age) {
		count++;// 생성될 때마다 +1
		agesum = agesum + age;// age를 agesum변수에 누적
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override // 재정의
	public String toString() {
		return "직원정보 [이름=" + name + ", 성별=" + gender + ", 나이=" + age + "]";
	}

}
