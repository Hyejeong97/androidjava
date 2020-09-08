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
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

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
		lblPw.setBounds(31, 143, 106, 83);
		f.getContentPane().add(lblPw);

		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("굴림", Font.PLAIN, 45));
		lblName.setBounds(31, 226, 201, 83);
		f.getContentPane().add(lblName);

		JLabel lblTel = new JLabel("TEL");
		lblTel.setFont(new Font("굴림", Font.PLAIN, 45));
		lblTel.setBounds(31, 308, 106, 83);
		f.getContentPane().add(lblTel);
		
		

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 35));
		t1.setBounds(214, 66, 247, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(214, 160, 247, 45);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setColumns(10);
		t3.setBounds(214, 245, 247, 45);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 30));
		t4.setColumns(10);
		t4.setBounds(214, 324, 247, 45);
		f.getContentPane().add(t4);
		

		JLabel log = new JLabel("");
		JButton read = new JButton("\uC911\uBCF5\uCCB4\uD06C");//중복체크
		read.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String id = t1.getText();// id
			String pw = t2.getText();// pw
			MemberDAO dao = new MemberDAO();

			try {
				boolean result = dao.read(id, pw);
				if (result == true) {// 검색결과가 있음.
					log.setText("로그인 ok");
				} else {// 검색결과가 없음.
					log.setText("로그인 not");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	});
		read.setFont(new Font("굴림", Font.PLAIN, 30));
		read.setBounds(150, 462, 181, 56);
		f.getContentPane().add(read);

		log.setForeground(Color.RED);
		log.setFont(new Font("굴림", Font.PLAIN, 30));
		log.setBounds(140, 384, 175, 48);
		f.getContentPane().add(log);
		
		
		JButton create = new JButton("\uAC00\uC785");
		create.setFont(new Font("굴림", Font.PLAIN, 30));
		create.addActionListener(new ActionListener() {//가입
			public void actionPerformed(ActionEvent e) {
				// 회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText(); // 무조건 스트링
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText(); 
				// db처리(memberDAO), create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		create.setBounds(17, 462, 120, 56);
		f.getContentPane().add(create);
		
		
		JButton read_1 = new JButton("\uAC80\uC0C9");//검색
		read_1.setFont(new Font("굴림", Font.PLAIN, 30));
		read_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					MemberVO bag = dao.one(id);
					t1.setText(bag.getId());
					t2.setText(bag.getId());
					t3.setText(bag.getId());
					t4.setText(bag.getId());
				}catch(Exception e1){
					
				}
			}
		});
		
		read_1.setBounds(341, 462, 120, 56);
		f.getContentPane().add(read_1);
		
		
		JButton update = new JButton("\uD68C\uC6D0\uC218\uC815");//회원수정
		update.setFont(new Font("굴림", Font.PLAIN, 30));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 수정
				String id = t1.getText();
				String tel = t4.getText();

				MemberDAO dao = new MemberDAO();

				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		update.setBounds(17, 533, 215, 56);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("\uD68C\uC6D0\uC0AD\uC81C");//회원삭제
		delete.setFont(new Font("굴림", Font.PLAIN, 30));
		delete.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {// 삭제
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
		delete.setBounds(249, 533, 212, 56);
		f.getContentPane().add(delete);
		f.setVisible(true);
	}
}
