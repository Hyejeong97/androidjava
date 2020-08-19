package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		
		int ok=0, no =0, etc=0;
		//누적시키는 변수는 반복문 안에 넣으면 안됨.
		//반복할때마다 누적되지 않고 초기화되기 때문에
		
		for (int i = 0; i < 5; i++) {
			
			String data = JOptionPane.showInputDialog("긍정:ok, 부정:no, etc:기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				ok++;//증감연산자
				//ok = ok + 1;
				//ok의 초기값이 0이고 +1하게되면 다시 ok에 저장해야됨
				
			}else if(data.equals("no")){
				System.out.println("부정");
				no++;
				
			}else {
				System.out.println("잘 모르겠음.");
				etc++;
			}
		}
		System.out.println("긍정횟수: "+ ok + "회");
		System.out.println("부정횟수 : " + no + "회");
		System.out.println("잘 모르겠음 횟수 : " + etc + "회");

	}

}
