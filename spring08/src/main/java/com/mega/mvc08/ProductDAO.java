package com.mega.mvc08;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(ProductVO vo) {
		mybatis.insert("product.insert", vo);
	}
	public void update(ProductVO vo) {
		mybatis.update("product.update", vo);
	}
	public void delete(ProductVO vo) {
		mybatis.delete("product.delete", vo);
	}
	public List<ProductVO> list() {//입력값이 없어서
		List<ProductVO> list = mybatis.selectList("product.list");
		 return list;
	}
	
}
