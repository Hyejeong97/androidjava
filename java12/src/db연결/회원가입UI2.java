package db����;

import javax.swing.JOptionPane;

public class ȸ������UI2 {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("id�Է�");
		String pw = JOptionPane.showInputDialog("pw�Է�");
		String name = JOptionPane.showInputDialog("name�Է�");
		String tel = JOptionPane.showInputDialog("tel�Է�");

		MemberVO bag = new MemberVO();// ������ �����
		
		bag.setId(id);
		//set�޼��带 ���ؼ� ���濡 �� ������ �ϳ��� ��������
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		MemberDAO dao = new MemberDAO();
		dao.create(bag);
	}

}
