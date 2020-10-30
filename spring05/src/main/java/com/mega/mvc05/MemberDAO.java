package com.mega.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;//mybatis를 끼워줌
	
	public void insert(MemberVO vo) {
		mybatis.insert("member.create", vo);
	}
	
}
