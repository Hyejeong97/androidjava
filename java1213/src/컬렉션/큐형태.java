package �÷���;

import java.util.LinkedList;

public class ť���� {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();

		milk.add("���ѿ���");
		milk.add("�̽̿���");
		milk.add("���Ͽ���");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		
		milk.remove();
		System.out.println("----");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		
		System.out.println(milk);
		
	}

}
