package com.mega.mvc08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	@RequestMapping("create2.do")
	public void create2(ProductVO productVO) {
		service.insert(productVO);
	}
	
	@RequestMapping("update2.do")
	public void update2(ProductVO productVO) {
		service.update(productVO);
	}
	
	@RequestMapping("delete2.do")
	public void delete2(ProductVO productVO) {
		service.delete(productVO);
	}
	
	@RequestMapping("list2.do")
	public void list2(Model model) {
		List<ProductVO> list = service.list();
		model.addAttribute("list", list);
	}
}
