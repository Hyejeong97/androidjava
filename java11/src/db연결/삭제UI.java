package db����;

import javax.swing.JOptionPane;

public class ����UI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("������ id�Է�");
		
		DB��������Ŭ���� db = new DB��������Ŭ����();
		db.delete(id);

	}

}
