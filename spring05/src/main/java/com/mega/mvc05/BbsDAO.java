package com.mega.mvc05;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(BbsVO vo) {
		mybatis.insert("bbs.create", vo);
	}
	
	public BbsVO select(BbsVO vo) {
		BbsVO vo2 = mybatis.selectOne("bbs.one", vo);
		return vo2;
	}
	
	public List<BbsVO> list() {
		List<BbsVO> list = mybatis.selectList("bbs.list");
		return list;
	}
	
	public void delete(BbsVO vo) {
		mybatis.delete("bbs.delete", vo);
	}
	
	
	public void update(BbsVO vo) {
		mybatis.update("bbs.update", vo);
	}
	
	
}
