package 조건문;

import javax.swing.JOptionPane;

public class IfTest2_1 {

	public static void main(String[] args) {
		
			
		int ok=0, no =0, etc=0;
		
			while(true) {
			String data = JOptionPane.showInputDialog("긍정:ok, 부정:no, etc:기타, 종료:exit");
			if(data.equals("exit")) {
				System.out.println("반복문 종료합니다.");
				break;	
				
			}else if (data.equals("ok")) {
				System.out.println("긍정");
				ok++;
				
			}else if(data.equals("no")){
				System.out.println("부정");
				no++;
				
			}else {
				System.out.println("잘 모르겠음.");
				etc++;

			}
			System.out.println("긍정횟수: "+ ok + "회");
			System.out.println("부정횟수 : " + no + "회");
			System.out.println("잘 모르겠음 횟수 : " + etc + "회");
		}
			

	}

}


