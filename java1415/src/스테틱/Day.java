package ����ƽ;

public class Day {
	String doing;
	int time;
	String location;

	static String company = "mega";
	static int count;// ���������� �ڵ��ʱ�ȭ�� ��. 0���� �ʱ�ȭ!
	static int sum;// �ð�����

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

	public static String getName() {
		return company; // static �޼��� �������� �ν��Ͻ� ���� ���Ұ�.
		// �ν��Ͻ� ������ ��ü ���� �� ���� ����
	}
	// ���� ����ϴ� ����� �޼���� �ٷιٷ� �� �� �ְ� �����δ� ���� ����.
	// Integer.parseInt(), JoptionPane.showInputDialog()

	// �Ϲݸ޼���: ��ü���� ��, ������ ������ �ּҷ� ���� ����!
	public int getAvg() {
		return sum / count;
	}

	// �޼��� �̸��� �����ϰ� �� �� ����
	// ��, �Է°��� �޶�� ��.
	// �ϳ��� �̸��� �޼��� �̸����� �ؼ� ������ ���� �� ����.
	// �����ε�(overloading)
	// => ������ (�ϳ��� �̸����� �پ��� ������ �޼��带 ����)
	// (polymorphism, ����������)
	// static �޼���(���� �޼���) : ��ü �������� �ʾƵ�, �� ����� �ٷ� ��� ����
	// Ŭ���� �̸����� �ٷ� �����ؼ� ����� �� �ִ� �޼���� ����� ���� ����.

	// �Ķ���͸� ���ؼ� ���� ����������� �Ѳ����� ����ϰ��� �ϴ� ���
	// toString()�� ������
	@Override // ������, �������̵�
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + "]";
	}

}
