package ����ƽ;

public class ���� {
	String name;// �̸�
	char gender;// ����
	int age;// ����

	static int agesum;// ���̴���
	static int count;// �ο�����

	public ����(String name, char gender, int age) {
		count++;// ������ ������ +1
		agesum = agesum + age;// age�� agesum������ ����
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override // ������
	public String toString() {
		return "�������� [�̸�=" + name + ", ����=" + gender + ", ����=" + age + "]";
	}

}
