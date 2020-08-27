package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범배열이용 {
	static int now = 2;//현재 위치를 체크할 수 있는 변수, main 밖에서 뺄 때 static 붙여주기(클릭 연산할 때)

	public static void main(String[] args) {
		// 영화제목목록, 이미지목록, 감독목록, 평정목록
		String[] titles = { "다만 악에서 구하소서", "오케이 마담", "테넷", "극장판 짱구는 못말려", "캐리비안 해적과 마법 다이아몬드" };
		String[] images = { "다만.jpg", "오케이.jpg", "테넷.jpg", "짱구.jpg", "캐리비안.jpg" };
		String[] directors = { "홍원찬", "이철하", "크리스토퍼 놀란", "하시모토 마사카즈", "마리트 모움 온, 라스무스 A.실버르센" };
		double[] rates = { 7.79, 6.61, 9.21, 8.64, 4.00 };

		JFrame f = new JFrame();
		f.setTitle("나의 영화앨범");
		f.getContentPane().setBackground(new Color(204, 255, 255));
		f.setSize(602, 500);
		f.getContentPane().setLayout(null);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(110, 130, 200, 273);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		lblNewLabel_2.setBounds(332, 142, 92, 69);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directors[2]);
		director.setForeground(Color.RED);
		director.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		director.setBounds(342, 184, 156, 60);
		f.getContentPane().add(director);

		JLabel rate = new JLabel(rates[2] + "");//String만 가능하기 때문에 String으로 만들어줌
		rate.setForeground(Color.RED);
		rate.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		rate.setBounds(353, 289, 60, 25);
		f.getContentPane().add(rate);

		JLabel lblNewLabel_2_1 = new JLabel("평점");
		lblNewLabel_2_1.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(332, 231, 92, 69);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JButton title = new JButton(titles[2]);
		title.setForeground(Color.DARK_GRAY);
		title.setBackground(UIManager.getColor("Button.disabledShadow"));
		title.setFont(new Font("함초롬돋움", Font.BOLD, 35));
		title.setBounds(90, 27, 408, 77);

		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {//인터페이스(원래 별개 클라스 따라서 int now를 main밖으로 빼줌)
			public void actionPerformed(ActionEvent e) {
				
				if(now == 0) {
					now = 5;//-1하면 4번째 배열이기 때문에
				}
				
				now--;//1
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now] + "");//double이어서 string변환
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 153, 204));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton.setBounds(0, 161, 60, 136);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now == 4) {
					now = -1;//+1하면 0번째 배열이기 때문에
				}
				now++;//3
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now] + "");
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 153, 204));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton_1.setBounds(526, 161, 60, 136);
		f.getContentPane().add(btnNewButton_1);

		f.getContentPane().add(title);
		f.setVisible(true);
	}
}
