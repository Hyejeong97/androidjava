package 기본입출력;

import javax.swing.JOptionPane;

public class 입력2개3 {

	public static void main(String[] args) {
		
		//3) 숫자 1개를 입력받고, 문자 1개를 입력받아서
		//입력한 숫자 개수만큼 문자를 프린트
		
		
		
		String numdata = JOptionPane.showInputDialog("반복할 숫자");
		String strdata = JOptionPane.showInputDialog("반복할 문자");
		
		int num = Integer.parseInt(numdata);
		
		for(int i = 0; i<num; i++) {
			System.out.print(strdata);
		}
		

	}

}
