package �÷��Ǻ���;

import java.io.FileWriter;
import java.util.ArrayList;

public class �������Ϸ����� {

	public void save(ArrayList<����> list) {// ���»��� �Ѱܹ޾� ����
		System.out.println(list.size() + "���� ���¸� �Ѱܹ޾ҽ��ϴ�.");

		for (int i = 0; i < list.size(); i++) {// �����̳ʿ��� �ϳ��� ������
			���� account = list.get(i);

			System.out.println("���޵� ����: " + account);
			System.out.println("-------------------------");

			try {
				FileWriter w2 = new FileWriter(account.name + ".txt");
				w2.write(account.name + "\n");
				w2.write(account.field+ "\n");
				w2.write(account.money + "\n");
				w2.close();// ���Ͽ��ٰ� �� ����.

			} catch (Exception e) {

				System.out.println("���Ϸ� �����ϴٰ� ������ �߻���!");
			}

		}
	}

}
