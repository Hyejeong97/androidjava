package ũ�Ѹ�;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class �����ֽ�ũ�Ѹ�UI {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(204, 255, 255));
		f.setSize(500, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setFont(new Font("���ʷҵ���", Font.BOLD, 36));
		lblNewLabel.setBounds(185, 285, 139, 40);
		f.getContentPane().add(lblNewLabel);

		// �ڵ��ȣ
		t1 = new JTextField();
		t1.setForeground(new Color(0, 51, 255));
		t1.setFont(new Font("���ʷҵ���", Font.BOLD, 35));
		t1.setBounds(92, 340, 283, 52);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		// ũ�Ѹ� ���
		JTextArea t2 = new JTextArea();
		t2.setFont(new Font("���ʷҵ���", Font.BOLD, 24));
		t2.setBounds(76, 502, 318, 214);
		f.getContentPane().add(t2);

		// īī��������
		JButton b1 = new JButton("\uCE74\uCE74\uC624\uAC8C\uC784\uC988");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] codes = { "293490", "068270", "019170" };
				t1.setText(codes[0]);
				
				��������ũ�Ѹ� naver = new ��������ũ�Ѹ�();

				String[] result = naver.crawl(codes[0]);
				t2.setText("���簡 " + result[0]
						+ "\n������ ���� " + result[1] 
						+ "\n�������� " + result[2] 
						+ "\n���� " + result[3]
						+ "\n�� " + result[4]);

			}
		});
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(51, 153, 102));
		b1.setFont(new Font("���ʷҵ���", Font.BOLD, 35));
		b1.setBounds(92, 33, 274, 68);
		f.getContentPane().add(b1);

		// ��Ʈ����
		JButton b2 = new JButton("��Ʈ����");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] codes = { "293490", "068270", "019170" };
				t1.setText(codes[1]);
				
				��������ũ�Ѹ� naver = new ��������ũ�Ѹ�();
				String[] result = naver.crawl(codes[1]);
				t2.setText("���簡 " + result[0]
						+ "\n������ ���� " + result[1] 
						+ "\n�������� " + result[2] 
						+ "\n���� " + result[3]
						+ "\n�� " + result[4]);
			}
		});
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("���ʷҵ���", Font.BOLD, 35));
		b2.setBackground(new Color(51, 153, 102));
		b2.setBounds(92, 119, 274, 68);
		f.getContentPane().add(b2);

		// ��ǳ����
		JButton b3 = new JButton("\uC2E0\uD48D\uC81C\uC57D");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] codes = { "293490", "068270", "019170" };
				t1.setText(codes[2]);
				
				��������ũ�Ѹ� naver = new ��������ũ�Ѹ�();
				String[] result = naver.crawl(codes[2]);
				t2.setText("���簡 " + result[0]
						+ "\n������ ���� " + result[1] 
						+ "\n�������� " + result[2] 
						+ "\n���� " + result[3]
						+ "\n�� " + result[4]);
			}
		});
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("���ʷҵ���", Font.BOLD, 35));
		b3.setBackground(new Color(51, 153, 102));
		b3.setBounds(92, 202, 274, 68);
		f.getContentPane().add(b3);


		// ũ�Ѹ�����
		JButton b4 = new JButton("ũ�Ѹ� ����");
		b4.setBackground(new Color(51, 153, 102));
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("���ʷҵ���", Font.BOLD, 35));
		b4.setFont(new Font("���ʷҵ���", Font.BOLD, 24));
		t2.setBackground(new Color(255, 255, 255));
		b4.setBounds(76, 419, 318, 68);
		f.getContentPane().add(b4);

		f.setVisible(true);
	}
}
