//package �÷��Ǻ���;
//
//import java.io.FileWriter;
//import java.util.ArrayList;
//
//public class ���Ϸ����� {
//
//	public void save(ArrayList<Day> list) {
//		// �ܺο��� �����͸� �޾Ƽ� ���Ϸ� ����
//		System.out.println(list.size() + "��ġ�� �Ѿ����");
//		for (int i = 0; i < list.size(); i++) {
//			// �����̳ʿ����� list���� �ϳ��� ������ �κ�
//			Day day = list.get(i);
//			System.out.println("���޵� �ϰ�: " + day);
//			System.out.println("-------------------------");
//
//			// ���Ϸ� ������ ���� -> ����ó��
//			try {
//				// ������ ���� �����ϴ� ��ǰ�����
//				FileWriter w = new FileWriter(i + ".txt");
//				w.write(day.doing + "\n");
//				w.write(day.time + "\n");
//				w.write(day.location + "\n");
//				w.close();// ���Ͽ��ٰ� �� ����.
//			} catch (Exception e) {
//				// try���� �ִ� �ڵ忡�� ������ �߻����� ��, ����ó��
//				System.out.println("���Ϸ� �����ϴٰ� ������ �߻���!!!");
//			}
//		}
//
//	}
//}
