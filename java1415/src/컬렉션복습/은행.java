package �÷��Ǻ���;

import java.util.ArrayList;

public class ���� {

	public static void main(String[] args) {
		���� account1 = new ����("ȫ�浿", "��������", 1000);// �� �ְ� ����
		���� account2 = new ����("��浿", "���⿹��", 2000);
		���� account3 = new ����("���浿", "���⿹��", 5000);
		���� account4 = new ����("���浿", "���⿹��", 2000);
		���� account5 = new ����("�ֱ浿", "���⿹��", 6000);
		// �����޸� �Ҵ�
		// => ��ü ���� �ø��� ��ü���� ��������� ���簡 �Ǿ� ������ ����
		
		ArrayList<����> list = new ArrayList<>();
		list.add(account1);// ����Ʈ�� �� �ֱ�
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		
		�������Ϸ����� file = new �������Ϸ�����();
		
		file.save(list);// ����Ʈ�� �Ѱ��ִ� ����
		
		
	}

}
