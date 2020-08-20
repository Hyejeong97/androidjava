package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 봄여름 {

	public static void main(String[] args) {
		JFrame f = new JFrame(); // 창 생성
		
		JButton spring = new JButton(); // 버튼 생성
		spring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요."); // 액션효과
			}
		});
		
		spring.setForeground(Color.BLUE);
		spring.setBackground(Color.ORANGE);
		spring.setFont(new Font("궁서", Font.BOLD, 70));

		
		JButton summer = new JButton(); //버튼생성
		summer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요."); //액션효과
			}
		});
		summer.setBackground(Color.PINK);
		summer.setFont(new Font("궁서", Font.BOLD, 70));
		summer.setForeground(Color.GREEN);

		spring.setText("봄");//텍스트 넣기
		summer.setText("여름");//텍스트 넣기

		f.getContentPane().add(spring); //버튼에 spring 추가
		f.getContentPane().add(summer);//버튼에 summer 추가
		f.setSize(300, 300);//창 크기

		FlowLayout flow = new FlowLayout();//순서대로 해주는 부품 ,flowlayout은 창크기와 폰트 사이즈로 자동 조절됨.
		f.getContentPane().setLayout(flow); //레이아웃에 흐름을 적용하는 부품

		f.setVisible(true);// 마지막에 쓰기

	}

}
