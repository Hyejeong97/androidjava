package ����ȯCasting;

import java.util.ArrayList;

public class ����������ȯ {

	public static void main(String[] args) {
		// ��Ӱ��迡���� ����ȯ(Casting, ĳ����) ����
		// car(�θ�, ����), Truck(�ڽ�, ����)
		// Ŭ�������� ��Һ��� ���� ���������� ����
		// �θ�Ŭ������ ũ��, �ڽ�Ŭ������ �۴�

		ArrayList list = new ArrayList();
		// �迭�� ���� Ÿ�Ը�
		// ArrayList�� ��� Ÿ���� ���� �� ����. ũ�Ⱑ ����

		list.add("ȫ�浿");
		// Object(ū)<-String(��): �ڵ�����ȯ
		// ��ĳ����
		// ��� ������ Object
		list.add(100);
		// Object <--- upcasting ----Integer <--- auto boxing---- int
		list.add(50.2);
		list.add(true);
		list.add('A');
		list.add(new VO());

		System.out.println("��ϳ��� : " + list);

		// ��ĳ����(�ڵ�����ȯ)���� String�� Object���� ����ȯ�Ͽ� ���� ����
		// ������ �� Object������ String���� �߰��� ����� �� �� ����.
		// ���� ��, String���� ����ȯ�Ͽ� ������ �Ѵ�.
		// ��������ȯ, down casting(�ٿ� ĳ����)
		Object name = (String) list.get(0);
		int age = (Integer) list.get(1);
		// �⺻��<-- (���� ��ڽ�) <-- Integer <-- (�ٿ�ĳ����) <-- Object
		
		
		
		
	}

}
