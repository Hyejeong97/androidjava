package �÷���;

import java.util.HashMap;
// utility(��ƿ��Ƽ, �����ϰ� ����ϴ� �ʼ� ���̺귯��)

public class �����¸�� {

	public static void main(String[] args) {
		HashMap phone = new HashMap();

		phone.put(1, "����");
		phone.put(2, "�ƺ�");
		phone.put(3, "ģ��");
		System.out.println(phone);
		System.out.println(phone.get(1));

		phone.put(3, "��");// �� ����
		System.out.println(phone);

	}

}
