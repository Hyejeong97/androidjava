package Ŭ��������;

public class ���� {
	// [����] => class
	// ���α׷��Ϸ��� �ϴ� �����
	// 2���� Ư¡�� ������ ����.
	// 1) ���� ���̴� �Ӽ� : ��, ����, ũ��
	// => �������(��������, global����, Ŭ���� ��ü�������� ��밡��)
	// => �ڵ��ʱ�ȭ
		String color; // ������(null)
		int price;// �⺻��(0)
		int size;// �⺻��(0)
		
		
	// 2) ���� : ���ϴ�, ����, ���ϴ�, ������
	// => ����޼���(�Է°�, ��ȯ�� ����)
	public int ���ϴ�(int c1, int c2) {//�޼���(���) ����
		// �Ű�����(parameter)
		// void : ����. ��ȯ���� ����.
		int result = c1 + c2;
		return result;
		
	}
	public int ����(int c1, int c2) {
		int result = c1 - c2;
		return result;
	}
	public void ������() {
		
	}
	public int ���ϴ�(int c1, int c2) {
		int result = c1 * c2;
		return result;
	}
}
