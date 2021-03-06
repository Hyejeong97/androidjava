package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsService service;
	
	@RequestMapping("delete.do")
	public void delete() {
		//db처리하고,
		//views로 넘어간다!
	}
	
	@RequestMapping("update.do")
	public void update(Model model) {
		//DB검색해서 가지고 온다.
		//검색한 결과를 views에 있는 update.jsp로 넘겨야 함.
		model.addAttribute("result", "나는 검색결과");
	}

	@RequestMapping("insert.do")
	public void insert(BbsVO bbsVO, HttpSession session) { // 자동으로 객체 생성, set까지 해줌
		// 입력값으로 vo를 설정하는 경우
		// 1) 객체생성 : prototype방법
		// 2) input name속성과 동일한 set메서드를 자동으로 호출
		// 3) 변수 이름을 클래스 이름의 첫글자를 소문자로 지정하는 경우
		// 자동으로 vo에 model 속성으로 지정
		// views의 아래 jsp파일에서 model속성값을 꺼내 쓸 수 있음.
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getContent());
		System.out.println(bbsVO.getWriter());
		
		//model은 한번의 request당 respose를 하고 사라진다.
		//여러번의 request 마다 특정한 값을 유지하고 사용하고 싶으면
		//session으로 설정해야 한다.
		session.setAttribute("bbsVO2", bbsVO);
		
		

	}

}
