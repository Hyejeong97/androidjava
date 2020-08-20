package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 나이판단 {

	public static void main(String[] args) {
		// 창
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(224, 255, 255));

		// 이미지
		ImageIcon img = new ImageIcon("sky.png");

		// 이미지, 이름, 나이
		JLabel sky = new JLabel();
		JLabel name = new JLabel();
		name.setFont(new Font("함초롬돋움", Font.BOLD, 45));
		JLabel year = new JLabel();
		year.setFont(new Font("함초롬돋움", Font.BOLD, 45));

		// 결과값
		JLabel result = new JLabel();
		result.setFont(new Font("함초롬돋움", Font.BOLD, 40));

		// 이름 입력창
		JTextField n = new JTextField(10);
		n.setForeground(new Color(255, 255, 255));
		n.setBackground(new Color(32, 178, 170));
		n.setFont(new Font("함초롬돋움", Font.BOLD, 45));

		// 나이 입력창
		JTextField y = new JTextField(10);
		y.setForeground(new Color(255, 255, 255));
		y.setBackground(new Color(32, 178, 170));
		y.setFont(new Font("함초롬돋움", Font.BOLD, 45));

		
				
		
		
		// 결과 버튼
		JButton bu = new JButton();
		bu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t1 = n.getText();
				String t2 = y.getText();
				
				int year2 = Integer.parseInt(t2);
				int age = 18;
				
				if((2020-year2) >= age) {
					result.setText(t1 + "은 성인입니다.");
				}else {
					result.setText(t1 + "은 미성년입니다.");
				}
				
			}
		});

		bu.setForeground(new Color(255, 255, 255));
		bu.setBackground(new Color(46, 139, 87));
		bu.setFont(new Font("함초롬돋움", Font.BOLD, 45));

		FlowLayout flow = new FlowLayout();// 흐름대로

		f.getContentPane().add(sky);// 이미지 추가
		f.setSize(500, 800);// 창크기
		f.getContentPane().setLayout(flow);// 흐름대로

		sky.setIcon(img);// 이미지 셋팅
		name.setText("이름");// 이름 글자 셋팅
		year.setText("태어난 년도");// 나이 글자 셋팅
		bu.setText("결과");// 결과 글자 셋팅
		
		//창에 순서대로 입력
		f.getContentPane().add(sky);
		f.getContentPane().add(name);
		f.getContentPane().add(n);
		f.getContentPane().add(year);
		f.getContentPane().add(y);
		f.getContentPane().add(bu);
		f.getContentPane().add(result);


		
		f.setVisible(true);

	}

		
	
	}

	
