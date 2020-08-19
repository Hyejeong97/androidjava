package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의윈도우2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("나를 눌러요.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "버튼입니다");
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("상단버튼");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "상단이지롱");
			}
		});
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 25));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "왼쪽이지롱");
			}
		});
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "오른쪽이지롱");
			}
		});
		btnNewButton_3.setBackground(Color.PINK);
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "하단이지롱");
			}
		});
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton_4.setBackground(Color.PINK);
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);

	}

}
