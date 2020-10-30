package com.mega.mvc07;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Bean
//@Component 컴포넌트 == bean /부모클래스!

@Repository
public class MemberDAO {
	
	@Autowired //껴주기
	SqlSessionTemplate mybatis;//sqlsessiontemplate mybatis의 원래 이름

	public void insert(MemberVO vo) {
		mybatis.insert("member.insert", vo);//(sql문 실행해주렴, 너가 넘길 값들이야)
	}
	public void update(MemberVO vo) {
		mybatis.update("member.update", vo);
	}
	public void delete(MemberVO vo) {
		mybatis.delete("member.delete", vo);
	}
	public MemberVO one(MemberVO vo) {
		MemberVO vo2 = mybatis.selectOne("member.one", vo);
							//네임스페이스.id, 입력 param
		return vo2;
	}
	public List<MemberVO> list() {//입력값이 없어서
		List<MemberVO> list = mybatis.selectList("member.list");
		System.out.println("list size : " + list.size());
		return list;
	}
}
