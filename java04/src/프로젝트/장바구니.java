package 프로젝트;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 장바구니 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton menu2 = new JButton();
		menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menu2.setBounds(277, 100, 186, 33);
		menu2.setFont(new Font("굴림", Font.PLAIN, 20));
		menu2.setText("침실");
		JButton menu1 = new JButton();
		menu1.setBounds(90, 100, 175, 33);
		
		
		menu1.setFont(new Font("굴림", Font.PLAIN, 20));
		menu1.setText("소파/거실");
		
			
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(69, 80, 819, 2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(69, 151, 819, 2);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(92, 252, 132, 116);
		ImageIcon img1 = new ImageIcon("소파1.jpg");
		btnNewButton.setIcon(img1);
		
		JLabel top_1_1 = new JLabel();
		top_1_1.setBounds(242, 252, 159, 31);
		top_1_1.setText("소파1");
		top_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(80, 232, 819, 2);
		
		JLabel top_1_1_1 = new JLabel();
		top_1_1_1.setBounds(242, 286, 159, 31);
		top_1_1_1.setText("그레이/1개");
		top_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(600, 1026, 132, 116);
		
		JSeparator separator_2_1_1_1_2 = new JSeparator();
		separator_2_1_1_1_2.setBounds(80, 385, 819, 2);
		
		JLabel top_1_1_3 = new JLabel();
		top_1_1_3.setBounds(1068, 710, 159, 31);
		top_1_1_3.setText("소파1");
		top_1_1_3.setFont(new Font("굴림", Font.BOLD, 18));
		
		JLabel top_1_1_1_2 = new JLabel();
		top_1_1_1_2.setBounds(1068, 744, 159, 31);
		top_1_1_1_2.setText("그레이/1개");
		top_1_1_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().setLayout(null);
		f.getContentPane().add(menu1);
		f.getContentPane().add(menu2);
		f.getContentPane().add(separator_2);
		f.getContentPane().add(separator_2_1);
		f.getContentPane().add(separator_2_1_1_1_2);
		f.getContentPane().add(top_1_1_3);
		f.getContentPane().add(top_1_1_1_2);
		f.getContentPane().add(separator_2_1_1);
		f.getContentPane().add(btnNewButton_1);
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(top_1_1_1);
		f.getContentPane().add(top_1_1);
		
		JButton menu1_1 = new JButton();
		menu1_1.setText("로그인");
		menu1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		menu1_1.setBounds(707, 10, 90, 27);
		f.getContentPane().add(menu1_1);
		
		JButton menu1_1_1 = new JButton();
		menu1_1_1.setText("장바구니");
		menu1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		menu1_1_1.setBounds(809, 12, 90, 27);
		f.getContentPane().add(menu1_1_1);
		
		JButton menu2_1 = new JButton();
		menu2_1.setText("드레스룸");
		menu2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		menu2_1.setBounds(475, 100, 201, 33);
		f.getContentPane().add(menu2_1);
		
		JButton menu2_2 = new JButton();
		menu2_2.setText("주방");
		menu2_2.setFont(new Font("굴림", Font.PLAIN, 20));
		menu2_2.setBounds(688, 100, 175, 33);
		f.getContentPane().add(menu2_2);
		
		JLabel top_1_1_2 = new JLabel();
		top_1_1_2.setText("가구몰");
		top_1_1_2.setFont(new Font("굴림", Font.BOLD, 40));
		top_1_1_2.setBounds(424, -14, 208, 104);
		f.getContentPane().add(top_1_1_2);
		
		JLabel top_1_1_4 = new JLabel();
		top_1_1_4.setText("장바구니");
		top_1_1_4.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_4.setBounds(92, 191, 159, 31);
		f.getContentPane().add(top_1_1_4);
		
		JLabel top_1_1_5 = new JLabel();
		top_1_1_5.setText("결제금액");
		top_1_1_5.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_5.setBounds(729, 343, 159, 31);
		f.getContentPane().add(top_1_1_5);
		
		JLabel top_1_1_4_1 = new JLabel();
		top_1_1_4_1.setText("주문상품");
		top_1_1_4_1.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_4_1.setBounds(92, 444, 159, 31);
		f.getContentPane().add(top_1_1_4_1);
		
		JSeparator separator_2_1_1_1 = new JSeparator();
		separator_2_1_1_1.setBounds(80, 485, 819, 2);
		f.getContentPane().add(separator_2_1_1_1);
		
		JLabel top_1_1_6 = new JLabel();
		top_1_1_6.setText("소파1");
		top_1_1_6.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_6.setBounds(242, 505, 159, 31);
		f.getContentPane().add(top_1_1_6);
		
		JLabel top_1_1_1_1 = new JLabel();
		top_1_1_1_1.setText("그레이/1개");
		top_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		top_1_1_1_1.setBounds(242, 539, 159, 31);
		f.getContentPane().add(top_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(92, 505, 132, 116);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel top_1_1_5_1 = new JLabel();
		top_1_1_5_1.setText("결제금액");
		top_1_1_5_1.setFont(new Font("굴림", Font.BOLD, 18));
		top_1_1_5_1.setBounds(729, 596, 159, 31);
		f.getContentPane().add(top_1_1_5_1);
		
		JSeparator separator_2_1_1_1_2_1 = new JSeparator();
		separator_2_1_1_1_2_1.setBounds(80, 638, 819, 2);
		f.getContentPane().add(separator_2_1_1_1_2_1);
		
		f.setSize(976,810);
		f.setVisible(true);
		

	}
}
