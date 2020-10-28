package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MemberController {
	
	//컨트롤러에서 받기
	@RequestMapping("insert.do")
	public void insert(String id, String pw, Model model) {
		System.out.println("이 메서드가 자동 호출");
		System.out.println("id " + id);
		System.out.println("pw " + pw);
		
		
		
	//db처리
		String result = "로그인 실패!!";
    	if(id.equals("root") && pw.equals("1234")){
    		result="로그인 성공!";
    	}
    	model.addAttribute("result", result);
		
	}
}
