package db¿¬°á;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsCrudUI {
	private static JTextField t;
	private static JTextField c;
	private static JTextField w;
	private static JTextField n;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(173, 216, 230));

		f.setSize(900, 750);
		f.getContentPane().setLayout(null);

		JLabel lblbulletinBoardSystem = new JLabel("\uAC8C\uC2DC\uD310");
		lblbulletinBoardSystem.setBackground(Color.PINK);
		lblbulletinBoardSystem.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblbulletinBoardSystem.setBounds(27, 15, 241, 55);
		f.getContentPane().add(lblbulletinBoardSystem);

		JLabel lblNewLabel = new JLabel("No");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel.setBounds(27, 85, 78, 21);
		f.getContentPane().add(lblNewLabel);

		JLabel lblT = new JLabel("Title");
		lblT.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblT.setBounds(27, 121, 78, 21);
		f.getContentPane().add(lblT);

		t = new JTextField();
		t.setFont(new Font("±¼¸²", Font.PLAIN, 23));
		t.setBounds(132, 120, 554, 27);
		f.getContentPane().add(t);
		t.setColumns(10);

		JLabel lblContent = new JLabel("Content");
		lblContent.setFont(new Font("±¼¸²", Font.BOLD, 24));
		lblContent.setBounds(175, 250, 134, 42);
		f.getContentPane().add(lblContent);

		c = new JTextField();
		c.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		c.setBounds(37, 307, 387, 289);
		f.getContentPane().add(c);
		c.setColumns(10);

		JLabel lblWriter = new JLabel("Writer");
		lblWriter.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblWriter.setBounds(27, 168, 78, 21);
		f.getContentPane().add(lblWriter);

		w = new JTextField();
		w.setFont(new Font("±¼¸²", Font.PLAIN, 23));
		w.setBounds(132, 162, 226, 27);
		f.getContentPane().add(w);
		w.setColumns(10);

		// °Ô½Ã
		JButton create = new JButton("\uAC8C\uC2DC\uD558\uAE30");
		create.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		create.setForeground(new Color(255, 255, 255));
		create.setBackground(new Color(32, 178, 170));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = n.getText();
				int no = Integer.parseInt(num);

				String title = t.getText();
				String content = c.getText();
				String writer = w.getText();

				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();

				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				try {
					dao.create(bag);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		create.setBounds(695, 611, 134, 37);
		f.getContentPane().add(create);

		n = new JTextField();
		n.setFont(new Font("±¼¸²", Font.PLAIN, 23));
		n.setColumns(10);
		n.setBounds(132, 85, 226, 27);
		f.getContentPane().add(n);

		// 2°Ë»ö
		JButton read = new JButton("\uAC80\uC0C9");
		read.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		read.setForeground(new Color(255, 255, 255));
		read.setBackground(new Color(32, 178, 170));
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = n.getText();
				BbsDAO dao = new BbsDAO();
				try {
					BbsVO bag = dao.one(Integer.parseInt(no));
					n.setText(String.valueOf(bag.getNo()));
					t.setText(bag.getTitle());
					c.setText(bag.getContent());
					w.setText(bag.getWriter());
				} catch (Exception e1) {
				}
			}
		});
		read.setBounds(535, 611, 134, 37);
		f.getContentPane().add(read);

		// ±Û ¼öÁ¤
		JButton update = new JButton("\uAE00 \uC218\uC815");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(n.getText());
				String title = t.getText();
				String content = c.getText();
				String writer = w.getText();

				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();

				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				try {
					dao.update(bag);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		update.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		update.setForeground(Color.WHITE);
		update.setBackground(new Color(32, 178, 170));
		update.setBounds(378, 611, 134, 37);
		f.getContentPane().add(update);

		JButton delete = new JButton("\uAE00 \uC0AD\uC81C");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(n.getText());
				String title = t.getText();
				String content = c.getText();
				String writer = w.getText();

				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();

				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				try {
					dao.delete(bag);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		delete.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		delete.setForeground(Color.WHITE);
		delete.setBackground(new Color(32, 178, 170));
		delete.setBounds(215, 611, 134, 37);
		f.getContentPane().add(delete);

		// ÀüÃ¼¸ñ·Ï
		JTextArea all = new JTextArea();
		all.setFont(new Font("±¼¸²", Font.BOLD, 22));
		JButton list = new JButton("\uC804\uCCB4 \uBAA9\uB85D");
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsVO> list = dao.all();
					System.out.println("°Ô½ÃÆÇÀÇ °³¼ö: " + list.size() + "°³");
					for (int i = 0; i < list.size(); i++) {// 2
						BbsVO bag = list.get(i);
						all.append(bag.getNo() + " / " 
								+ bag.getTitle() + " / " + bag.getContent() + " / " 
								+ bag.getWriter() + "\n");
						
					}
				} catch (Exception e2) {

				}

			}

		});

		list.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		list.setForeground(Color.WHITE);
		list.setBackground(new Color(32, 178, 170));
		list.setBounds(47, 611, 134, 37);
		f.getContentPane().add(list);

		
		all.setBounds(441, 307, 400, 289);
		f.getContentPane().add(all);
		
		JLabel lblContentList = new JLabel("All List");
		lblContentList.setFont(new Font("±¼¸²", Font.BOLD, 24));
		lblContentList.setBounds(603, 250, 205, 42);
		f.getContentPane().add(lblContentList);
		f.setVisible(true);

	}
}
