package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; //위치 알려주는 역할

public class 나의그래픽 {

	public static void main(String[] args) {
		// 자바는 부폼조립식 코드 => 객체지향형프로그래밍(OOP)
		// ctrl + shift + o : 자동 import
		JFrame f = new JFrame();// new는 복사의 의미
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나를 눌러요를 눌렀군요!");
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나도 누르셨네용");
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "하늘입니다~~~~");
			}
		});
	//	String img = "sky.png";
		ImageIcon img = new ImageIcon("sky.png");//파일이나 이미지 경로를 안쓰면 파일 바로 밑 경로를 봄
		b1.setText("나를 눌러요"); //버튼에 글자넣기
		b2.setText("나도 눌러요");
		b3.setIcon(img);//버튼에 이미지 넣기
		f.getContentPane().add(b1); 
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.setSize(1000, 500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		f.setVisible(true);//맨아래에 두어야한다.
		
		
		
		
	}

}
