package �÷��Ǻ���;

import java.util.ArrayList;

public class �������� {

	public static void main(String[] args) {
		Day day1 = new Day("�ڹٰ���", 10, "����");	
		Day day2 = new Day("����", 15, "������");		
		Day day3 = new Day("�", 10, "��Ʈ�Ͻ�");
		

		
		ArrayList<Day> list = new ArrayList<>();
		
		list.add(day1);
		list.add(day2);
		list.add(day3);
		
		���Ϸ����� file = new ���Ϸ�����();
		file.save(list); // call by reference
		

	}

}
