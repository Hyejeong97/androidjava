package ũ�Ѹ�;

import java.io.FileWriter;

public class ���̹�����UI {

	public static void main(String[] args) {
		String[] codes = { "293490", "068270", "019170", "047820", "238090" };
		// String[] names = {"īī��������", "��Ʈ����", "��ǳ����","�ʷϹ�", "�ص�����"};

		���̹�����ũ�Ѹ�2 naver = new ���̹�����ũ�Ѹ�2();

		for (int i = 0; i < codes.length; i++) {
			String[] result = naver.crawl(codes[i]);
			try {
				FileWriter file = new FileWriter(result[0] + ".txt");
				file.write(result[0] + "\n");// �̸�
				file.write(result[1] + "\n");// code
				file.write(result[2] + "\n");// ���簡
				file.write(result[3] + "\n");// �������� ����
				file.write(result[4] + "\n");// ��������
				file.write(result[5] + "\n");// ����
				file.write(result[6] + "\n");// ��
			} catch (Exception e) {
				System.out.println("���� ���� �� ���� �߻�!");
			}

		}

	}

}
