package �÷���;

import java.util.LinkedList;

public class ����������� {

	public static void main(String[] args) {
		LinkedList sub = new LinkedList();

		sub.add("����");
		sub.add("����");
		sub.add("����");
		sub.add("��ǻ��");


		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i) + " ");
		}
		System.out.println();
		
		sub.remove();
		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i) + " ");
		}System.out.println();

		sub.remove();
		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i) + " ");
		}System.out.println();
		
		sub.remove();
		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i) + " ");
		}System.out.println();

	}

}
