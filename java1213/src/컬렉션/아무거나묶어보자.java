package �÷���;

import java.util.ArrayList;

import db����.BbsVO;

public class �ƹ��ų������ {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// ���� ���� ���� add(��)�޼��� ���
		list.add(19);// �⺻��
		list.add("�ڹٰ���");// ������
		list.add(25.5);// �⺻��
		list.add(false);
		list.add(new BbsVO());// ������

		// list�� ������ list.size()
		System.out.println(list.size() + "�� �������.");

		// �ϳ��� �����ö� get(index)�޼��� ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// ���� ���� remove(index)�޼��� ���
		list.remove(0); // 19
		System.out.println(list.size() + "�� �������.");
		System.out.println(list.get(0));
		
		//�߰��� �������� ���� add(�������� ��ġ, ��)�޼��� ���
		list.add(0, "ȫ�浿");// 0�� �տ� ��������.
		System.out.println(list.size() + "�� �������.");
		System.out.println(list.get(0));
		
		//���� ������ ���� set(������ ��ġ, ��)�޼��� ���
		list.set(0, "��浿");
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
			
		}
		
	}

}
