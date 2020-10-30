package com.mega.mvc08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO dao;
	
	public void insert(ProductVO vo) {
		dao.insert(vo);
	}
	public void update(ProductVO vo) {
		dao.update(vo);
	} 
	public void delete(ProductVO vo) {
		dao.delete(vo);
	}
	public List<ProductVO> list() {
		return dao.list();
	}
}
