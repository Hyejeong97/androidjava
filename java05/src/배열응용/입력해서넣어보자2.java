package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자2 {

	public static void main(String[] args) {
		

		String[] data = new String[3]; //3개의 공간을 만들어줌
		
		for (int i = 0; i < 3; i++) {

			data[i] = JOptionPane.showInputDialog("취미입력"); //각각의 공간에 하나씩 넣어줌

		}
			for(String x : data) {
				System.out.println(x);
		}
	}

}
