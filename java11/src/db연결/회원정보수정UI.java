package db����;

import javax.swing.JOptionPane;

public class ȸ����������UI {

	public void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("�˻��� id�Է�");
		String tel = JOptionPane.showInputDialog("������ tel�Է�");
		
		
		DB��������Ŭ���� db = new DB��������Ŭ����();
		db.update(tel, id);

	}

}
