package db연결;

import javax.swing.JOptionPane;

public class 삭제UI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("삭제할 id입력");
		
		DB연결전담클래스 db = new DB연결전담클래스();
		db.delete(id);

	}

}
