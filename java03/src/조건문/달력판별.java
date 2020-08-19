package 조건문;

import javax.swing.JOptionPane;

public class 달력판별 {

	public static void main(String[] args) {
		
		String month = JOptionPane.showInputDialog("월을 입력하세요.");
		int month1 = Integer.parseInt(month);
		
		switch(month1) {
		
		case 2:
			System.out.println("28일 입니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println("30일 입니다.");
			break;
			
		default : 
			System.out.println("31일 입니다.");
			break;
		}
		
	}

}
