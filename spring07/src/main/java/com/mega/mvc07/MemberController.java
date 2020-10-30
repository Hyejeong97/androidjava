package com.mega.mvc07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //나 컨트롤러임
public class MemberController {
	
	@Autowired//서비스 껴주셈
	MemberService service;
	
	@RequestMapping("create2.do")
	public void create2(MemberVO memberVO) {
		service.insert(memberVO);
	}
	
	@RequestMapping("update2.do")
	public void update2(MemberVO memberVO) {
		service.update(memberVO);
	}
	
	@RequestMapping("delete2.do")
	public void delete2(MemberVO memberVO) {
		service.delete(memberVO);
	}
	
	@RequestMapping("one2.do")
	public void one(MemberVO memberVO,  Model model) {
		MemberVO vo = service.one(memberVO);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("list2.do")
	public void list2(Model model) {
		List<MemberVO> list = service.list();
		model.addAttribute("list", list);
	}
}
