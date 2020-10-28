package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class pageController {
	
	//2. 컨트롤러에서 받아주고
	@RequestMapping("page2.mega")
	public void page2(String id, String pw) {
		System.out.println("이 메서드가 자동 호출됨..");
		System.out.println("컨트롤러에서 받은id " + id);
		System.out.println("컨트롤러에서 받은pw " + pw);
		
		//3. DAO객체써서 db처리
		String result = "로그인 실패!!";
    	if(id.equals("root") && pw.equals("1234")){
    		result="로그인 성공!";
    	}
	    
		//4. 처리 결과를 가지고 jsp페이지로 간다.
	}
}
