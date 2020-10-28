package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired //알아서 찾아서 끼워줌
	MemberDAO dao;
	
	public int sale(int price) {
		if(price >= 10000) {
			price = price - 1000;
		}
		return price;
	}
	
	public String check(String id) {
		
		String[] id2 = {"root","admin","apple","melon","mint"};
		
		String result= "<p class=blue>사용 가능한 아이디입니다.</p>";
		for (int i = 0; i < id2.length; i++) {
			if(id.equals(id2[i])) {
				result = "<p class=red>중복된 아이디가 있습니다!</p>";
			}
		}
		return result;
	}
}
