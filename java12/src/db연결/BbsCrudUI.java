package db¿¬°á;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsCrudUI {
	private static JTextField t;
	private static JTextField c;
	private static JTextField w;
	private static JTextField n;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));

		f.setSize(900, 750);
		f.getContentPane().setLayout(null);

		JLabel lblbulletinBoardSystem = new JLabel("\uAC8C\uC2DC\uD310");
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
		lblContent.setBounds(27, 246, 134, 42);
		f.getContentPane().add(lblContent);

		c = new JTextField();
		c.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		c.setBounds(37, 307, 777, 289);
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

		JButton create = new JButton("\uAC8C\uC2DC\uD558\uAE30");
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
		create.setBounds(680, 611, 134, 37);
		f.getContentPane().add(create);
		
		n = new JTextField();
		n.setFont(new Font("±¼¸²", Font.PLAIN, 23));
		n.setColumns(10);
		n.setBounds(132, 85, 226, 27);
		f.getContentPane().add(n);
		f.setVisible(true);

	}
}
