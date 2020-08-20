package 프로젝트;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주요화면1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		JLabel top = new JLabel();
		top.setBounds(392, 10, 159, 58);
		top.setFont(new Font("굴림", Font.BOLD, 50));
		top.setText("가구몰");
		
		
		JButton menu4 = new JButton();
		menu4.setBounds(698, 100, 159, 33);
		menu4.setFont(new Font("굴림", Font.PLAIN, 20));
		menu4.setText("주방");
		JButton menu3 = new JButton();
		menu3.setBounds(483, 100, 189, 33);
		menu3.setFont(new Font("굴림", Font.PLAIN, 20));
		menu3.setText("드레스룸");
		JButton menu2 = new JButton();
		menu2.setBounds(288, 100, 165, 33);
		menu2.setFont(new Font("굴림", Font.PLAIN, 20));
		menu2.setText("침실");
		JButton menu1 = new JButton();
		menu1.setBounds(93, 100, 174, 33);
		
		
		menu1.setFont(new Font("굴림", Font.PLAIN, 20));
		menu1.setText("소파/거실");
		
		JButton login = new JButton("로그인");
		login.setBounds(745, 10, 89, 27);
		login.setFont(new Font("굴림", Font.PLAIN, 15));
		
		JButton basket = new JButton("장바구니");
		basket.setBounds(846, 10, 97, 27);
		basket.setFont(new Font("굴림", Font.PLAIN, 15));
		
			
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(69, 80, 819, 2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(69, 151, 819, 2);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(80, 205, 200, 208);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ImageIcon img1 = new ImageIcon("소파1.jpg");
		btnNewButton.setIcon(img1);
		
		JLabel top_1 = new JLabel();
		top_1.setBounds(80, 419, 159, 31);
		top_1.setText("소파1");
		top_1.setFont(new Font("굴림", Font.BOLD, 26));
		
		JLabel top_1_1 = new JLabel();
		top_1_1.setBounds(80, 456, 159, 31);
		top_1_1.setText("판매가격");
		top_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().setLayout(null);
		f.getContentPane().add(menu1);
		f.getContentPane().add(menu2);
		f.getContentPane().add(menu3);
		f.getContentPane().add(menu4);
		f.getContentPane().add(top);
		f.getContentPane().add(login);
		f.getContentPane().add(basket);
		f.getContentPane().add(separator_2);
		f.getContentPane().add(separator_2_1);
		f.getContentPane().add(top_1_1);
		f.getContentPane().add(top_1);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(381, 205, 200, 208);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(687, 205, 200, 208);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(80, 597, 200, 208);
		f.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(392, 597, 200, 208);
		f.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(688, 597, 200, 208);
		f.getContentPane().add(btnNewButton_5);
		
		JLabel top_1_2 = new JLabel();
		top_1_2.setText("소파1");
		top_1_2.setFont(new Font("굴림", Font.BOLD, 26));
		top_1_2.setBounds(381, 419, 159, 31);
		f.getContentPane().add(top_1_2);
		
		JLabel top_1_1_1 = new JLabel();
		top_1_1_1.setText("판매가격");
		top_1_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_1.setBounds(381, 456, 159, 31);
		f.getContentPane().add(top_1_1_1);
		
		JLabel top_1_3 = new JLabel();
		top_1_3.setText("소파1");
		top_1_3.setFont(new Font("굴림", Font.BOLD, 26));
		top_1_3.setBounds(687, 419, 159, 31);
		f.getContentPane().add(top_1_3);
		
		JLabel top_1_1_2 = new JLabel();
		top_1_1_2.setText("판매가격");
		top_1_1_2.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_2.setBounds(687, 456, 159, 31);
		f.getContentPane().add(top_1_1_2);
		
		JLabel top_1_4 = new JLabel();
		top_1_4.setText("소파1");
		top_1_4.setFont(new Font("굴림", Font.BOLD, 26));
		top_1_4.setBounds(80, 815, 159, 31);
		f.getContentPane().add(top_1_4);
		
		JLabel top_1_1_3 = new JLabel();
		top_1_1_3.setText("판매가격");
		top_1_1_3.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_3.setBounds(80, 852, 159, 31);
		f.getContentPane().add(top_1_1_3);
		
		JLabel top_1_5 = new JLabel();
		top_1_5.setText("소파1");
		top_1_5.setFont(new Font("굴림", Font.BOLD, 26));
		top_1_5.setBounds(392, 815, 159, 31);
		f.getContentPane().add(top_1_5);
		
		JLabel top_1_1_4 = new JLabel();
		top_1_1_4.setText("판매가격");
		top_1_1_4.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_4.setBounds(392, 852, 159, 31);
		f.getContentPane().add(top_1_1_4);
		
		JLabel top_1_6 = new JLabel();
		top_1_6.setText("소파1");
		top_1_6.setFont(new Font("굴림", Font.BOLD, 26));
		top_1_6.setBounds(698, 815, 159, 31);
		f.getContentPane().add(top_1_6);
		
		JLabel top_1_1_5 = new JLabel();
		top_1_1_5.setText("판매가격");
		top_1_1_5.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_5.setBounds(698, 852, 159, 31);
		f.getContentPane().add(top_1_1_5);
		
		f.setSize(1000,1000);
		f.setVisible(true);
		

	}
}
