package �÷���;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class �÷��ǹ��� {

	public static void main(String[] args) {
		// 1)
		ArrayList run = new ArrayList();

		System.out.println("1��");
		run.add("�ڼ���");
		run.add("������");
		run.add("������");
		run.add("�谳��");

		for (int i = 0; i < run.size(); i++) {
			System.out.println((i + 1) + "�� " + run.get(i));
		}
		System.out.println();

		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println((i + 1) + "�� " + run.get(i));
		}
		System.out.println();

		// 2)

		HashMap cus = new HashMap();

		System.out.println("2��");
		cus.put(100, "�赥��");
		cus.put(200, "�����");
		cus.put(300, "�豸��");
		cus.put(400, "���ڷ�");

		System.out.println(cus);

		cus.remove(200);
		cus.put(300, "���漺");// �� ����
		
		System.out.println(cus);
		System.out.println();
		
		
		//4��
		System.out.println("4��");
		HashSet tr = new HashSet();
		
		tr.add("����");
		tr.add("�Ϻ�");
		tr.add("�ʸ���");
		tr.add("ĳ����");
		tr.add("�̱�");
		tr.add("�Ϻ�");
		tr.add("�ʸ���");
		
		System.out.println("��ü ������ " + tr);
		
		
		

	}

}
