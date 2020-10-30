package com.mega.mvc07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //서비스 역할하는 싱글톤으로 껴주어야 controller에서 쓸 수 있음
public class MemberService {
	//controller에 껴주깅
	
	@Autowired
	MemberDAO dao;
	
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}
	
	public void update(MemberVO vo) {
		dao.update(vo);
	}
	
	public void delete(MemberVO vo) {
		dao.delete(vo);
	}
	
	public MemberVO one(MemberVO vo) {
		return dao.one(vo);
	}
	
	public List<MemberVO> list() {
		return dao.list();
	}

}
