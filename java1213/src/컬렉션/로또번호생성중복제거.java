package �÷���;

import java.util.HashSet;
import java.util.Random;

public class �ζǹ�ȣ�����ߺ����� {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();

		while (lotto.size() < 6) {// 6�ڸ��� �ƴ϶�� ��� �ݺ�
			lotto.add(r.nextInt(45) + 1);
			// 1~45���� ��ȣ �����Ͽ� �� �ֱ�

		}
		System.out.println(lotto);// 6�� �̻��̸� ���
	}

}
