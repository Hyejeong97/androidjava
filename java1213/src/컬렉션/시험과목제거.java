package 컬렉션;

import java.util.LinkedList;

public class 시험과목제거 {

	public static void main(String[] args) {
		LinkedList sub = new LinkedList();

		sub.add("국어");
		sub.add("수학");
		sub.add("영어");
		sub.add("컴퓨터");


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
