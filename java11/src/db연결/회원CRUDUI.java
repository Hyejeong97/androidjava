package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.fabric.xmlrpc.base.Member;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField j1;
	private static JTextField j2;
	private static JTextField j3;
	private static JTextField j4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("굴림", Font.PLAIN, 45));
		lblId.setBounds(31, 45, 106, 83);
		f.getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 45));
		lblPw.setBounds(31, 130, 106, 83);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("굴림", Font.PLAIN, 45));
		lblName.setBounds(31, 213, 201, 83);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 45));
		lblTel.setBounds(31, 295, 106, 83);
		f.getContentPane().add(lblTel);
		
		j1 = new JTextField();
		j1.setFont(new Font("굴림", Font.PLAIN, 35));
		j1.setBounds(214, 66, 247, 45);
		f.getContentPane().add(j1);
		j1.setColumns(10);
		
		j2 = new JTextField();
		j2.setFont(new Font("굴림", Font.PLAIN, 30));
		j2.setColumns(10);
		j2.setBounds(214, 147, 247, 45);
		f.getContentPane().add(j2);
		
		j3 = new JTextField();
		j3.setFont(new Font("굴림", Font.PLAIN, 30));
		j3.setColumns(10);
		j3.setBounds(214, 232, 247, 45);
		f.getContentPane().add(j3);
		
		j4 = new JTextField();
		j4.setFont(new Font("굴림", Font.PLAIN, 30));
		j4.setColumns(10);
		j4.setBounds(214, 311, 247, 45);
		f.getContentPane().add(j4);
		
		JButton t1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		JButton t2 = new JButton("\uD68C\uC6D0\uAC80\uC0C9");
		JButton t3 = new JButton("\uD68C\uC6D0\uC218\uC815");
		JButton t4 = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
		
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();//id로 검색
				MemberDAO dao = new MemberDAO();
				
				try {
					int result  = dao.read(id);
					if(result == 1) {//검색결과가 있음.
						
					}else {//검색결과가 없음.
						j1.setText("없음");
						j2.setText("없음");
						j3.setText("없음");
						j4.setText("없음");
						
						j1.setBackground(Color.BLUE);
						j2.setBackground(Color.BLUE);
						j3.setBackground(Color.BLUE);
						j4.setBackground(Color.BLUE);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		t2.setBounds(257, 431, 173, 68);
		f.getContentPane().add(t2);
		
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//수정
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				MemberDAO dao = new MemberDAO();
				
				try {
					dao.update(pw, name, tel, id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		t3.setBounds(45, 528, 173, 68);
		f.getContentPane().add(t3);
		
		t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//삭제
				String id = t1.getText();
				
				MemberDAO dao = new MemberDAO();
				
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText(); // 무조건 스트링
				String pw = t2.getText(); // 무조건 스트링
				String name = t3.getText(); // 무조건 스트링
				String tel = t4.getText(); // 무조건 스트링
				//db처리(memberDAO), create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		t1.setBounds(45, 431, 173, 68);
		f.getContentPane().add(t1);
		
		t4.setBounds(257, 528, 173, 68);
		f.getContentPane().add(t4);
		f.setVisible(true);
	}
}
