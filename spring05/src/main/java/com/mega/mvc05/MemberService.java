package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO dao;//dao생성
	
	public void create(MemberVO vo) {//vo에 set
		dao.insert(vo);//insert처리
	}

}