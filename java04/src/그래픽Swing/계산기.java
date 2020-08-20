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

public class 계산기 {

	public static void main(String[] args) {
		// 프레임1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 218, 185));
		
		// 이미지1
		ImageIcon img = new ImageIcon("cal.png");
		
		// 라벨3
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 45));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.BOLD, 45));
		
		
		JLabel result = new JLabel();
		result.setFont(new Font("굴림", Font.BOLD, 45));
		result.setForeground(new Color(128, 0, 0));
		
		JTextField t1 = new JTextField(10); //한줄입력	
		t1.setForeground(Color.RED);
		t1.setBackground(Color.ORANGE);
		t1.setFont(new Font("굴림", Font.BOLD, 45));
		
		
		JTextField t2 = new JTextField(10); //한줄입력	
		t2.setForeground(Color.RED);
		t2.setBackground(Color.ORANGE);
		t2.setFont(new Font("굴림", Font.BOLD, 45));
		
		
		
		// 버튼1
		JButton plus = new JButton();
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2의 입력한 값을 가지고 와야함.
				//가지고 온 값의 데이터타입은 무조건 String!
				String s1 = t1.getText();//get은 가져오는 함수
				String s2 = t2.getText();

				
				//산술연산을 하려면, 숫자로 변환
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				//숫자로 변환한 값들을 더하자.
				
				int sum = i1 + i2;
				
				
				//처리한 결과를 사용자에게 보여줌.(출력)
				//result.setText(sum + "");//결과값이 String이 됨
				String sum2 = String.valueOf(sum);//스트링으로 바꿔주는 함수
				result.setText(sum2);
				
			}
		});
		plus.setBackground(new Color(210, 105, 30));
		plus.setFont(new Font("굴림", Font.BOLD, 45));
		// 레이아웃1
		FlowLayout flow = new FlowLayout();
		
		f.setSize(500, 700);
		f.getContentPane().setLayout(flow); //순서대로 붙여줌
		l1.setIcon(img);
		l2.setText("숫자1");
		l3.setText("숫자2");
		plus.setText("+");
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(l3);	
		f.getContentPane().add(t2);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton();
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String minus1 = t1.getText();
				String minus2 = t2.getText();
				
				System.out.println("t1값 : " + minus1);
				System.out.println("t2값 : " + minus2);
				
				int mi1 = Integer.parseInt(minus1);
				int mi2 = Integer.parseInt(minus2);
				
				int min = mi1 - mi2;
				
				String min2 = String.valueOf(min);//스트링으로 바꿔주는 함수
				result.setText(min2);
				
			}
		});
		minus.setText("-");
		minus.setFont(new Font("굴림", Font.BOLD, 45));
		minus.setBackground(new Color(210, 105, 30));
		f.getContentPane().add(minus);
		
		JButton mul = new JButton();
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String multi1 = t1.getText();
				String multi2 = t2.getText();
				
				int mult1 = Integer.parseInt(multi1);
				int mult2 = Integer.parseInt(multi2);
				
				int mul1 = mult1 * mult2;
				
				String mul2 = String.valueOf(mul1);
				result.setText(mul2);
				
			}
		});
		mul.setText("*");
		mul.setFont(new Font("굴림", Font.BOLD, 45));
		mul.setBackground(new Color(210, 105, 30));
		f.getContentPane().add(mul);
		
		JButton div = new JButton();
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String division1 = t1.getText();
				String division2 = t2.getText();
				
				int divi1 = Integer.parseInt(division1);
				int divi2 = Integer.parseInt(division2);
				
				int div1 = divi1 / divi2;
				
				String div2 = String.valueOf(div1);
				result.setText(div2);
				
			}
		});
		div.setText("/");
		div.setFont(new Font("굴림", Font.BOLD, 45));
		div.setBackground(new Color(210, 105, 30));
		f.getContentPane().add(div);
		
		JButton identi = new JButton();
		identi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String identifi1 = t1.getText();
				String identifi2 = t2.getText();
				
				int identi1 = Integer.parseInt(identifi1);
				int identi2 = Integer.parseInt(identifi2);
				
				if(identi1>identi2) {
					result.setText(identi1 + "(이)가 더 큽니다.");
				}else {
					result.setText(identi2 + "(이)가 더 큽니다.");
				}
			}
		});
		identi.setText("크기 판별");
		identi.setFont(new Font("굴림", Font.BOLD, 45));
		identi.setBackground(new Color(210, 105, 30));
		f.getContentPane().add(identi);
		
		
		
		
		// 텍스트 입력2
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		
		f.getContentPane().add(t1);
		
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		f.getContentPane().add(plus);
		f.getContentPane().add(minus);
		f.getContentPane().add(mul);
		f.getContentPane().add(div);
		f.getContentPane().add(identi);
		f.getContentPane().add(result);
		

		
		
		
		f.setVisible(true);
		

	}

}
