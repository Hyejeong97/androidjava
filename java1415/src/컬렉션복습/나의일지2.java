package �÷��Ǻ���;

public class ��������2 {

	public static void main(String[] args) {
		Day day1 = new Day("�ڹٰ���", 10, "����");
		System.out.println(Day.count + "�� ������.");

		Day day2 = new Day("����", 15, "������");
		System.out.println(Day.count + "�� ������.");

		Day day3 = new Day("�", 10, "��Ʈ�Ͻ�");
		System.out.println(Day.count + "�� ������.");
		// ���� Ŭ���� �̸����� ����, Ŭ������ �빮�ڷ� ����

		System.out.println("��ü �ð�: " + Day.sum);

		System.out.println("��� �ð�: " + Day.sum / Day.count);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		
	}
}
