package �÷��Ǻ���;

public class Day {
	String doing;
	int time;
	String location;

	static int count;// ���������� �ڵ��ʱ�ȭ�� ��. 0���� �ʱ�ȭ!
	static int sum;//�ð�����
	
	// �Է°��� �� 3���� �� �־�� �� ��ǰ�� �̿��� �� ����.
	// �Է°�(�Ķ����, �Ű�����)�� �ִ� Ŭ���� �̸��� ������
	// �޼��带 ������ּ���. ��ü������ �ڵ� ȣ���.
	// ������(�޼���, constructor)

	

	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	
	// �޼��� �̸��� �����ϰ� �� �� ����
	// ��, �Է°��� �޶�� ��.
	// �ϳ��� �̸��� �޼��� �̸����� �ؼ� ������ ���� �� ����.
	// �����ε�(overloading)
	// => ������ (�ϳ��� �̸����� �پ��� ������ �޼��带 ����)
	// 		(polymorphism, ����������)
	
	
	// �Ķ���͸� ���ؼ� ���� ����������� �Ѳ����� ����ϰ��� �ϴ� ���
	// toString()�� ������
	
	@Override // ������, �������̵�
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time +  "]";
	}

	
	
}
