package db����;

import java.util.ArrayList;

public class �Խ�����ü�������Ʈ {

	public static void main(String[] args) throws Exception {
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> list = dao.all();
		System.out.println("�Խ����� ����: " + list.size() + "��");
		for (int i = 0; i < list.size(); i++) {//2
			BbsVO bag = list.get(i);
			System.out.println("No: " + bag.getNo());
			System.out.println("Title: " + bag.getTitle());
			System.out.println("Content: " + bag.getContent());
			System.out.println("Writer" + bag.getWriter());
			System.out.println();
		}
	}

}
