package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자4 {

	public static void main(String[] args) {
		

		int[] data = new int[3]; //3개의 공간을 만들어줌
		
		for (int i = 0; i < 3; i++) {

			String s = JOptionPane.showInputDialog("점수입력"); //각각의 공간에 하나씩 넣어줌
			data[i] = Integer.parseInt(s);

		}
			for(int x : data) {
				System.out.println(x);
		}
	}

}
