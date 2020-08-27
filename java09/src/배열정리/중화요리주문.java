package 배열정리;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 중화요리주문 {
	static int count = 0;//초기화
	static int sum = 0;//초기화
	
	public static void main(String[] args) {
		
		String[] images = {"짬뽕.jpg","우동.jpg","짜장.jpg"};//배열선언, 값저장
		
	
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 204, 102));
		f.setSize(713,526);
		f.getContentPane().setLayout(null);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\johyejeong\\workspace\\java09\\짜장.jpg"));
		img.setBounds(140, 111, 400, 281);
		f.getContentPane().add(img);
		
		JButton num = new JButton("");
		num.setForeground(Color.BLUE);
		num.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		num.setBackground(Color.WHITE);
		num.setBounds(521, 10, 164, 50);
		
		JLabel pay = new JLabel("");
		pay.setForeground(Color.RED);
		pay.setFont(new Font("함초롬돋움", Font.BOLD, 27));
		pay.setBounds(272, 402, 268, 55);
		f.getContentPane().add(pay);
		
		JButton red = new JButton("짬뽕");
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images[0]);//이미지 배열의 첫 번째 이미지 
				img.setIcon(icon);//이미지에 넣기
				count++;//한 번 클릭할때 +1 
				num.setText(count + "개");//카운트 출력
				pay.setText((sum = sum + 4000) + "원");//4000원 덧셈 후 sum에 저장하고 출력
			}
		});
		red.setBackground(new Color(255, 102, 51));
		red.setFont(new Font("함초롬돋움", Font.BOLD, 27));
		red.setBounds(12, 10, 130, 50);
		f.getContentPane().add(red);
		
		JButton white = new JButton("우동");
		white.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images[1]);//이미지 배열의 두 번째 이미지
				img.setIcon(icon);//이미지에 넣기
				count++;//한 번 클릭할때 +1 
				num.setText(count + "개");//카운트 출력
				pay.setText((sum = sum + 4500) + "원");//4500원 덧셈 후 sum에 저장하고 출력
			}
		});
		white.setBackground(new Color(204, 0, 102));
		white.setFont(new Font("함초롬돋움", Font.BOLD, 27));
		white.setBounds(154, 10, 130, 50);
		f.getContentPane().add(white);
		
		JButton black = new JButton("짜장");
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images[2]);//이미지 배열의 세 번째 이미지 
				img.setIcon(icon);//이미지에 넣기
				count++;//한 번 클릭할때 +1 
				num.setText(count + "개");//카운트 출력
				pay.setText((sum = sum + 5000) + "원");//5000원 덧셈 후 sum에 저장하고 출력
			}
		});
		black.setBackground(new Color(0, 153, 204));
		black.setFont(new Font("함초롬돋움", Font.BOLD, 27));
		black.setBounds(296, 10, 130, 50);
		f.getContentPane().add(black);
		
		JLabel lblNewLabel = new JLabel("개수입력");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		lblNewLabel.setBounds(449, 28, 69, 15);
		f.getContentPane().add(lblNewLabel);
		
		
		f.getContentPane().add(num);
		
		JLabel lblNewLabel_1 = new JLabel("지불할 총 금액");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.BOLD, 30));
		lblNewLabel_1.setBounds(46, 402, 238, 55);
		f.getContentPane().add(lblNewLabel_1);
			
		f.setVisible(true);
	}
}
