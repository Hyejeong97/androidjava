package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//db처리했음
		//views로 넘어감.
		model.addAttribute("reply", reply);
	}
	
	@RequestMapping("check.do")
	public String check(String id, Model model) {
		id = service.check(id);
		model.addAttribute("id", id);
		
		return "check";
	}
	
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model model, MovieService service) {
		price = service.sale(price);

		System.out.println("컨트롤러에서 받은 영화 제목은 " + title);
		System.out.println("컨트롤러에서 받은 영화 가격은 " + price);

		
		model.addAttribute("title", title);
		model.addAttribute("price", price);
		
		return "like";
	}

}
